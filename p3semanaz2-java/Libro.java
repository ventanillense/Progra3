/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3semanaz1;

public class Libro extends Publicacion{
    
    public Libro(String nombre, String[] autores, int anho, String edicion,
            String editorial, String lugar){
        super(nombre,autores,anho);
        this.edicion=edicion;
        this.editorial=editorial;
        this.lugar=lugar;
    }
    
    private String editorial;
    private String edicion;
    private String lugar;
    
    public String getEditorial() {
        return editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public String getEdicion() {
        return edicion;
    }
    
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    public String getLugar() {
        return lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    @Override
    public String toString(){
        String referencia = " " + edicion + " ed.";
        referencia += ". " + lugar;
        referencia += ": " + editorial;
        referencia += ".";
        return super.toString() + referencia;
    }

    @Override
    public void metodoAbstracto() {
        
    }
    
}
