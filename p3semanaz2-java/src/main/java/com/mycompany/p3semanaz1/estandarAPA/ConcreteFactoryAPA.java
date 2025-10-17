/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3semanaz1.estandarAPA;

import com.mycompany.p3semanaz1.AbstractFactoryPublicacion;
import com.mycompany.p3semanaz1.Autor;
import com.mycompany.p3semanaz1.Clase_de_Tesis;
import com.mycompany.p3semanaz1.Publicacion;
import java.util.ArrayList;

public class ConcreteFactoryAPA implements AbstractFactoryPublicacion{
    @Override
    public Publicacion crearArticulo(String nombre, String nombre_completo_autor, Integer año,
            String revista, Integer volumen, Integer numero, String mes) {
        return new Articulo(nombre, nombre_completo_autor, año, revista, volumen, numero, mes);
    }

    @Override
    public Publicacion crearArticulo(String nombre, ArrayList<Autor> autores, Integer año,
            String revista, Integer volumen, Integer numero, String mes) {
        return new Articulo(nombre, autores, año, revista, volumen, numero, mes);
    }

    @Override
    public Publicacion crearLibro(String nombre, String nombre_completo_autor, Integer año,
            String edicion, String lugar, String editorial) {
        return new Libro(nombre, nombre_completo_autor, año, edicion, lugar, editorial);
    }

    @Override
    public Publicacion crearLibro(String nombre, ArrayList<Autor> autores, Integer año,
            String edicion, String lugar, String editorial) {
        return new Libro(nombre, autores, año, edicion, lugar, editorial);
    }

    @Override
    public Publicacion crearTesis(String nombre, String nombre_completo_autor, Integer año,
            Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado) {
        return new Tesis(nombre, nombre_completo_autor, año, clase, departamento, institucion, ciudad, estado);
    }

    @Override
    public Publicacion crearTesis(String nombre, ArrayList<Autor> autores, Integer año,
            Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado) {
        return new Tesis(nombre, autores, año, clase, departamento, institucion, ciudad, estado);
    }
}
