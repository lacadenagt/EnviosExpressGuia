/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author santoslopeztzoy
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexion {
    private static Conexion instancia;
    public static synchronized Conexion getInstancia(){
        if(instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }
    
    private Connection conection;
    private Statement statement;
    //private String urlDriver="com.mysql.cj.jdbc.Driver";
    private String urlDriver="com.mysql.cj.jdbc.Driver";

    
    public Conexion(){
        
        try{
            Class.forName(urlDriver).newInstance();
            
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error capturado: "+e,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        
        try{
            //String url = "jdbc:mysql://localhost:3306/guiaenvios?serverTimeZone=UTC";
            String url = "jdbc:mysql://localhost:3306/guiaenvios?serverTimezone=UTC";

            String user="root";
            String password="thecrimson";
            
            // intentar establecer la conexion
            conection = DriverManager.getConnection(url,user,password);
            
            if(conection==null){
                JOptionPane.showMessageDialog(null,"Error capturado en la conexión: "+conection,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }else{
                System.out.println("Se realizo la conexion");
            }
            
            statement = conection.createStatement();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error capturado: "+ex,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public static void main(String[] args){
        Conexion c = new Conexion();
        
    }
}
