/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.p3semanaz1;

import java.util.ArrayList;

public interface AbstractFactoryPublicacion {
    
    public abstract Publicacion crearArticulo(String nombre, String nombre_completo_autor,
            Integer año, String revista, Integer volumen, Integer numero, String mes);
    
    public abstract Publicacion crearArticulo(String nombre, ArrayList<Autor> autores,
            Integer año, String revista, Integer volumen, Integer numero, String mes);

    public abstract Publicacion crearLibro(String nombre, String nombre_completo_autor,
            Integer año, String edicion, String lugar, String editorial);
    
    public abstract Publicacion crearLibro(String nombre, ArrayList<Autor> autores,
            Integer año, String edicion, String lugar, String editorial);
    
    public abstract Publicacion crearTesis(String nombre, String nombre_completo_autor,
            Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado);
    
    public abstract Publicacion crearTesis(String nombre, ArrayList<Autor> autores,
            Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado);
    
}
