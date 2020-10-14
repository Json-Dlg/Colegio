/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sfuturo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jeiss
 */
public class conexionBD {
     Connection con;
     public conexionBD(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             con  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "root", "");
             System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.err.println("Error: "+ e);
        }hola camilo como estas 
    }
    
}
jklgguyjhgjkhkjh