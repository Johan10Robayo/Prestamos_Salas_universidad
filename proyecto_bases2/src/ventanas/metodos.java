/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author johan
 */
public class metodos {
    
    
    
  // se cargan los combos independientes es decir que no dependen de info de otro combo
    public void cargar_combo(JComboBox entidad,String codigo,String tabla){
    conexiones con= new conexiones();
    java.sql.Connection conectar = null;
    String consulta ;
   
     consulta ="SELECT DISTINCT "+codigo+" FROM "+tabla+" ORDER BY "+codigo+" ASC ";
    
   
    
    try{
    java.sql.Statement st=con.getConexion().createStatement();
    ResultSet resultado=st.executeQuery(consulta);
    
    while(resultado.next()){
    entidad.addItem(resultado.getString(codigo));
    }
    
    resultado.close();
    st.close();
    con.getConexion().close();
    
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"error "+e.getMessage());
    }
    
    }
   
    public void cargar_combo(JComboBox entidad,String codigo,String codigo1,String codigo2,String tabla){
    
    entidad.removeAllItems();
    conexiones con= new conexiones();
    java.sql.Connection conectar = null;
    String consulta ="SELECT "+codigo+" FROM "+tabla+" WHERE "+codigo1+" LIKE '%"+codigo2+"%'";
      
    try{
    java.sql.Statement st=con.getConexion().createStatement();
    ResultSet resultado=st.executeQuery(consulta);
    
    while(resultado.next()){
    entidad.addItem(resultado.getString(codigo));
    }
    
    resultado.close();
    st.close();
    con.getConexion().close();
    
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"error "+e.getMessage());
           
    
   }
    
    }
    
   public void cargar_textos(JLabel texto,String nombrecampo,String cod_combo,String entidad,String nombre_cod){
    
    conexiones con= new conexiones();
    java.sql.Connection conectar = null;
 // String consulta ="SELECT nomb_programa FROM programa";
   String consulta ="SELECT "+nombrecampo+" FROM "+entidad+" WHERE "+nombre_cod+" LIKE '%"+cod_combo+"%'";
    
    try{
    java.sql.Statement st=con.getConexion().createStatement();
    ResultSet resultado=st.executeQuery(consulta);
    
  while(resultado.next()){
    texto.setText(resultado.getString(nombrecampo));
    }
    
    resultado.close();
    st.close();
    con.getConexion().close();
    
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"error "+e.getMessage());
    }
    
    }
   
   
   
   public void cargar_textos(JLabel texto,String atributo_sel,String entidad1,String entidad2,String atributo_comun,String cod_entidad1,String cod_seleccionado){
    
    conexiones con= new conexiones();
    java.sql.Connection conectar = null;
   String consulta ="SELECT e2."+atributo_sel+" FROM "+entidad2+" e2 JOIN "+entidad1+" e1 ON e1."+atributo_comun+"= e2."+atributo_comun+" WHERE "+cod_entidad1+"='"+cod_seleccionado+"'";
    
    try{
    java.sql.Statement st=con.getConexion().createStatement();
    ResultSet resultado=st.executeQuery(consulta);
    
  while(resultado.next()){
    texto.setText(resultado.getString(atributo_sel));
    }
    
    resultado.close();
    st.close();
    con.getConexion().close();
    
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"error "+e.getMessage());   
   }
    
    }
   
    public void cargar_textos(JLabel texto,String nombrecampo,String nombrecampo2,String cod_combo,String entidad,String nombre_cod){
    
    conexiones con= new conexiones();
    java.sql.Connection conectar = null;
 // String consulta ="SELECT nomb_programa FROM programa";
   String consulta ="SELECT "+nombrecampo+" FROM "+entidad+" WHERE "+nombre_cod+" LIKE '%"+cod_combo+"%'";
    String consulta2 ="SELECT "+nombrecampo2+" FROM "+entidad+" WHERE "+nombre_cod+" LIKE '%"+cod_combo+"%'";
    try{
    java.sql.Statement st=con.getConexion().createStatement();
    java.sql.Statement st2=con.getConexion().createStatement();
    ResultSet resultado=st.executeQuery(consulta);
    ResultSet resultado2=st2.executeQuery(consulta2);
    
  while(resultado.next()&&resultado2.next()){
    texto.setText(resultado.getString(nombrecampo)+"  "+resultado2.getString(nombrecampo2));
    }
    
    resultado.close();
    resultado2.close();
    st.close();
    st2.close();
    con.getConexion().close();
    
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"error "+e.getMessage());
    }
    
    }
  
   
   
   //*******************************
   public void validar_atributo (String atributo,String campo,int tamaño){
   if((atributo.length()>20||atributo.length()==0)){//el atributo digitado en el jtexfield debe ser menor a 20 porque así se definió en  la bd 
 JOptionPane.showMessageDialog(null,"Por favor digite correctamente su "+campo+", este debe tener \n"
         + "como máximo un tamaño de "+tamaño+" caracteres");
      
   }
   }
   public void validar_fecha(String fecha){// se valida si no se ha digitado una fecha
   if(fecha.equals("null/null/null")){
   JOptionPane.showMessageDialog(null," Por favor digite la fecha");
   }
   }
   
   
   public void validar_insercion_horas(int hora_entrada,int hora_salida,int minentrada,int minsalida){
      if(hora_salida<hora_entrada ){// se valida que se digite correctamente la hora 
       JOptionPane.showMessageDialog(null," La hora de salida debe ser mayor como mínimo en \n"
               + " 30 minutos a la hora de entrada");
        }else{
       if(hora_entrada==hora_salida){
      if(minsalida-minentrada>=30 ||minsalida==minentrada ||minentrada>minsalida){
       JOptionPane.showMessageDialog(null," La hora de salida debe ser mayor como mínimo en \n"
               + " 30 minutos a la hora de entrada");
      }
      }
      }
   
   }
   
   public void validar_reserva(){
   
   }
   
   public void insertar_estudiante(String cod_estudiante,String cod_programa,String nomb_estudiante,String apel_estudiante){
   conexiones con= new conexiones();
    java.sql.Connection conectar = null;
    String consulta ="INSERT INTO estudiante(cod_estudiante,cod_programa,nomb_estudiante,apel_estudiante) VALUES ('"+cod_estudiante+"','"+cod_programa+"','"+nomb_estudiante+"','"+apel_estudiante+"')";
      
    try{
    java.sql.Statement st=con.getConexion().createStatement();
    ResultSet resultado=st.executeQuery(consulta);
    
    resultado.close();
    st.close();
    con.getConexion().close();
    
       }catch(Exception e){
        
           
    
   }
   }
   
   public void hacer_reserva(String cod_estudiante,String cod_equipo,String fecha,String horaa_entrada,String horaa_salida,String software){
    conexiones con= new conexiones();
    java.sql.Connection conectar = null;
    String consulta ="INSERT INTO solicita (cod_estudiante,cod_equipo,fecha,hora_entrada,hora_salida,software) VALUES ('"
            +cod_estudiante+"','"+cod_equipo+"','"+fecha+"','"+horaa_entrada+"','"+horaa_salida+"','"+software+"')";
    try{
    java.sql.Statement st=con.getConexion().createStatement();
    ResultSet resultado=st.executeQuery(consulta);
    resultado.close();
    st.close();
    con.getConexion().close();
    
       }catch(Exception e){
        
   }
   }
    
    
      
    
}
