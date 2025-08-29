/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3semanaz1;

public class Tesis extends Publicacion{
    
    public Tesis(String nombre, String autor, int anho, String clase, String departamento,
            String institucion, String ciudad, String estado){
        super(nombre,autor,anho);
        this.clase=clase;
        this.departamento=departamento;
        this.institucion=institucion;
        this.ciudad=ciudad;
        this.estado=estado;
    }
    
    private String clase;
    private String departamento;
    private String institucion;
    private String ciudad;
    private String estado;
    
    public String getClase() {
        return clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getInstitucion() {
        return institucion;
    }
    
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        String referencia = " " + "Tesis de " + clase;
        referencia += ", " + departamento;
        referencia += ", " + institucion;
        referencia += ", " + ciudad;
        referencia += ", " + estado;
        referencia += ".";
        return super.toString() + referencia;
    }

    @Override
    public void metodoAbstracto() {
        
    }
    
}
