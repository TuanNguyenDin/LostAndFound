/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fu.ex.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author ADMIN
 */
public class DBConnect {

    public Connection getConnection() throws Exception, NamingException {
        Connection connection = null;
        Context ctx = new InitialContext();
        Context envContext = (Context) ctx.lookup("java:comp/env");
        DataSource ds = (DataSource) envContext.lookup("DataText");
        connection = ds.getConnection();
        return connection;
    }
//    public Connection getConnection() throws Exception {
//        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        return DriverManager.getConnection(url, userID, password);
//    }
//
//    private final String serverName = "localhost";
//    private final String portNumber = "1433";
//    private final String dbName = "LnF";
//    private final String userID = "sa";
//    private final String password = "1234";
}
