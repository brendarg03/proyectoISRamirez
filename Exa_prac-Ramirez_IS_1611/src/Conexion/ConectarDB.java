//Clase principal de conexión permanente a base de datos
package Conexion;

//librerias de conexion
import java.sql.Connection; //conexion a base de datos
import java.sql.DriverManager; //puente de conexion entre BD y JAVA
import java.sql.Statement; //sentencias SQL
import java.sql.SQLException; //tratamiento de errores
import java.sql.ResultSet; //resultado final de bd
import javax.swing.JOptionPane; //ventanas emergentes

public class ConectarDB { //inicia clase
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
   
    //metodo de conexion a BD  
    public void  conectarBase(){ //inicia metodo conectar
    
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/BaseISRamirez","root","");
        stmt = cn.createStatement();//genera sentencias sobre objetos de base de datos
        JOptionPane.showMessageDialog(null, "Conexión a base de datos efectiva\nRamirez");
        
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error de base de datos 1: Verifica info de BD\n"+ ex);
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de base de datos 2: Generales"+ e);
    }
    
    }//termina metodo conectar
    
} //termina clase
