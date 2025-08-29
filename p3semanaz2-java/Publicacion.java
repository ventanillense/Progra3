/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3semanaz1;

abstract class Publicacion {
    
    public Publicacion(){}
    
    public Publicacion(String nombre, String autor, int anho){
        this.nombre=nombre;
        this.autores = new String[1];
        this.autores[0]=autor;
        this.cantidad_autores=1;
        this.anho=anho;
    }
    
    public Publicacion(String nombre, String[] autores, int anho){
        this.nombre=nombre;
        this.autores=new String[autores.length];
        for (int i = 0; i < autores.length; i++) {
            this.autores[i]=autores[i];
        }
        this.cantidad_autores = autores.length;
        this.anho=anho;
    }
    
    public Publicacion(Publicacion p){
        nombre=p.nombre;
        autores=new String[p.cantidad_autores];
        for (int i = 0; i < p.cantidad_autores; i++) {
            autores[i] = p.autores[i];
        }
        cantidad_autores=p.cantidad_autores;
        anho=p.anho;
    }
    
    public static int orden_presentacion=1;
    private String nombre;
    private String[] autores;
    private int cantidad_autores;
    private int anho;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String[] getAutores() {
        return autores;
    }
    
    public void setAutores(String[] autores) {
        this.autores = autores;
    }
    
    public int getCantidad_autores() {
        return cantidad_autores;
    }
    
    public void setCantidad_autores(int cantidad_autores) {
        this.cantidad_autores = cantidad_autores;
    }
    
    public int getAnho() {
        return anho;
    }
    
    public void setAnho(int anho) {
        this.anho = anho;
    }
    
    @Override
    public String toString() {
        String referencia = "[" + Publicacion.orden_presentacion + "] ";
        for (int i = 0; i < cantidad_autores; i++) {
            referencia += autores[i];
            if(i<cantidad_autores-2)
                referencia+=", ";
            else if(i==cantidad_autores-2)
                referencia+=" and ";
        }
        referencia+=". ";
        referencia+=nombre;
        referencia+=". ";
        referencia+=anho;
        referencia+=".";
        return referencia;
    }
    
    public abstract void metodoAbstracto();
}

