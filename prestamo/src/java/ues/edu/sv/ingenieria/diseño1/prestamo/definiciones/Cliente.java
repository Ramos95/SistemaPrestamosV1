package ues.edu.sv.ingenieria.diseño1.prestamo.definiciones;

import java.util.Date;

/**
 *
 * @author erick
 */
public class Cliente {

    private String dui;
    private String nit;
    private String nombres;
    private String apellidos;
    private char sexo;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private String observaciones;

    public Cliente() {
        

    }

    public Cliente(String dui, String nit, String nombres, String apellidos, char sexo, String direccion, String telefono, Date fechaNacimiento, String observaciones) {
        this.dui = dui;
        this.nit = nit;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.observaciones = observaciones;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    
}
