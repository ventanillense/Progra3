/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3semanaz1;
import java.util.ArrayList;

public abstract class Publicacion {
    
    public Publicacion(){}
    
    public Publicacion(String nombre, String autor, Integer anho){
        this.nombre=nombre;
        this.autores = new ArrayList<>();
        Autor autor1 = new Autor(autor);
        this.autores.add(autor1);
        this.cantidad_autores=1;
        this.anho=anho;
    }
    
    public Publicacion(String nombre, ArrayList<Autor> autores, Integer anho){
        this.nombre=nombre;
        this.autores=new ArrayList<>();
        for (int i = 0; i < autores.size(); i++) {
            this.autores.add(i, autores.get(i));
        }
        this.cantidad_autores = autores.size();
        this.anho=anho;
    }
    
    public Publicacion(Publicacion p){
        nombre=p.nombre;
        autores=new ArrayList<>();
        for (int i = 0; i < p.cantidad_autores; i++) {
            autores.add(i, p.autores.get(i));
        }
        cantidad_autores=p.cantidad_autores;
        anho=p.anho;
    }
    
    public static Integer orden_presentacion=1;
    protected String nombre;
    protected ArrayList<Autor> autores;
    protected Integer cantidad_autores;
    protected Integer anho;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
//    @Override
//    public String toString() {
//        String referencia = "[" + Publicacion.orden_presentacion + "] ";
//        for (int i = 0; i < cantidad_autores; i++) {
//            referencia += autores.get(i).getNombres() + " ";
//            referencia += autores.get(i).getApellidos();
//            if(i<cantidad_autores-2)
//                referencia+=", ";
//            else if(i==cantidad_autores-2)
//                referencia+=" and ";
//        }
//        referencia+=". ";
//        referencia+=nombre;
//        referencia+=". ";
//        referencia+=anho;
//        referencia+=".";
//        return referencia;
//    }
    
    public abstract void metodoAbstracto();
}

