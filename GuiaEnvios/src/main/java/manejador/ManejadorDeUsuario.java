/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejador;

/**
 *
 * @author santoslopeztzoy
 */

import db.Conexion;
import bean.Usuario;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ManejadorDeUsuario {
    private static ManejadorDeUsuario instancia;
    private ArrayList<Usuario> mostrarUsuario;
    public static ManejadorDeUsuario getInstancia(){
        if(instancia==null){
            instancia=new ManejadorDeUsuario();
        }
        return instancia;
    }
    
    // constructor
    public ManejadorDeUsuario(){
        mostrarUsuario = new ArrayList<Usuario>();
    }
    
    public ArrayList<Usuario> listarUsuarios(){
        return mostrarUsuario;
    }
    
    
    public Usuario iniciarSesion(String user,String password, int idTipoUsuario){
        
        Usuario usuario = null;
        
        String query = "SELECT * FROM Usuario WHERE username=? AND contrasena=? AND idTipoUsuario=?";
        Object[] params= {user,password,idTipoUsuario};
        
        ResultSet consulta = Conexion.getInstancia().hacerConsulta(query, params);
        
        if(consulta!=null){
            try{
                while(consulta.next()){
                    usuario = new Usuario(
                            consulta.getString("correo"),
                            consulta.getString("username"),
                            consulta.getString("contrasena"),
                            Integer.parseInt(consulta.getString("idEstadoCuenta")),
                            Integer.parseInt(consulta.getString("idTipoUsuario"))
                    );
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
        return usuario;
    }
}
