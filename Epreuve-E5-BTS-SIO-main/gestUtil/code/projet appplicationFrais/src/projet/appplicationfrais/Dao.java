/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet.appplicationfrais;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mleprovost
 */
public class Dao {

    private String url = "jdbc:mysql://localhost/applifrais";
    private String user = "root";
    private String passwd = "";
    private Connection connect;

    public Dao(String url, String user, String passwd) {
        this.url = url;
        this.user = user;
        this.passwd = passwd;

        try {
            connect = DriverManager.getConnection(this.url, this.user, this.passwd);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        // TODO add your handling code here:

    }

    public Dao() {
        try {
            connect = DriverManager.getConnection(this.url, this.user, this.passwd);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public ResultSet query(String sql) {
        ResultSet sr = null;
        try {
            Statement stmt = this.connect.createStatement();
            sr = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return sr;

    }

    public PreparedStatement prepareQuery(String sql) {
        PreparedStatement myStmt = null;
        try {
            myStmt = this.connect.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return myStmt;

    }
}
