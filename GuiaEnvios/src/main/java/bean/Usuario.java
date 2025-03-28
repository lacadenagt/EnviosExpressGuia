/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author santoslopeztzoy
 */
public class Usuario {
    
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correo;
    private String username;
    private String contrasena;
    private Date fechaRegistro;
    private int idEstadoCuenta;
    private int idTipoUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    /*public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }*/

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdEstadoCuenta() {
        return idEstadoCuenta;
    }

    public void setIdEstadoCuenta(int idEstadoCuenta) {
        this.idEstadoCuenta = idEstadoCuenta;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    
    public Usuario(){}
    
    public Usuario(String correo,String username, String contrasena,int idEstadoCuenta, int idTipoUsuario){
        this.correo=correo;
        this.username=username;
        this.contrasena=contrasena;
        this.idEstadoCuenta=idEstadoCuenta;
        this.idTipoUsuario=idTipoUsuario;
    }
    
    
    public Usuario(int idUsuario, String nombres, String apellidos, String fechaNacimiento, String correo, String username, String contrasena, Date fechaRegistro, int idEstadoCuenta, int idTipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.username = username;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
        this.idEstadoCuenta = idEstadoCuenta;
        this.idTipoUsuario = idTipoUsuario;
    }
    
}
