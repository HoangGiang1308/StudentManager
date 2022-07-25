/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass.java3;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author truon
 */
public class database {
    public static Connection openConnection()throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=SQL_QLSV;";
        String username = "sa";
        String password = "1";
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        return con;
    }
}
