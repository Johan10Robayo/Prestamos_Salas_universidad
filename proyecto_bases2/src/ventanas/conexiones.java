/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import javax.swing.JOptionPane;


 public class conexiones {
     
     private  Connection conexion;

    public Connection getConexion() {
        return conexion;
    }
     
     
     public conexiones(){
     conexion();
     }
     
  public void conexion(){
      String  url ="jdbc:postgresql://localhost:5432/proyecto_based";
      String usuario= "postgres";
      String contraseña="12345";
        
        try{
        Class.forName("org.postgresql.Driver");
        conexion=DriverManager.getConnection(url,usuario,contraseña);
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"error de conexion "+e.getMessage());
        }
  
  }


}
