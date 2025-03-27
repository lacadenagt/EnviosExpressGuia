/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author santoslopeztzoy
 */
public class EstatusCuenta {
    private int idEstadoCuenta;
    // representa si la cuenta es ACTIVO o INACTIVO
    private String nombreEstadoCuenta;
    
    public int getIdEstadoCuenta(){
        return idEstadoCuenta;
    }
    
    public String getNombreEstadoCuenta(){
        return nombreEstadoCuenta;
    }
    
    public void setNombreEstadoCuenta(String nombreEstadoCuenta){
        this.nombreEstadoCuenta=nombreEstadoCuenta;
    }
    
    public EstatusCuenta(int idEstadoCuenta,String nombreEstadoCuenta){
        this.idEstadoCuenta=idEstadoCuenta;
        this.nombreEstadoCuenta=nombreEstadoCuenta;
    }
    
    
}
