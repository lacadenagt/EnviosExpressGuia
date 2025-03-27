/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author santoslopeztzoy
 */
public class TipoUsuario {
    private int idTipoUsuario;
    private String nombreTipo;
    
    public int getIdTipoUsuario(){
        return idTipoUsuario;
    }
    
    public String getNombreTipo(){
        return nombreTipo;
    }
    
    public void setNombreTipo(String nombreTipo){
        this.nombreTipo=nombreTipo;
    }
    
    public TipoUsuario(int idTipoUsuario,String nombreTipo){
        this.idTipoUsuario=idTipoUsuario;
        this.nombreTipo=nombreTipo;
    }
}
