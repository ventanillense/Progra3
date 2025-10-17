/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3semanaz1;

/**
 *
 * @author User
 */
public class Autor {
    
    public Autor(String nombres, String apellidos){
        this.nombres=nombres;
        this.apellidos=apellidos;
    }
    
    public Autor(String nombre_completo){
        Integer posicion_coma = nombre_completo.indexOf(",");
        this.apellidos = nombre_completo.substring(0, posicion_coma).trim();
        this.nombres = nombre_completo.substring(posicion_coma + 1).trim();
    }
    
    private String nombres;
    private String apellidos;
    
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
    
}
