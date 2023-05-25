/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projet.appplicationfrais;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tyvinec
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        lancement de ma page d'authentifcation
        loginPage f2 = new loginPage();
        f2.setVisible(true);

    }
}
