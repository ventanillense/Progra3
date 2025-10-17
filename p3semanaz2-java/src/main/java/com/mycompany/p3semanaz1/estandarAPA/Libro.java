/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.p3semanaz1.estandarAPA;
import com.mycompany.p3semanaz1.Autor;
import com.mycompany.p3semanaz1.Publicacion;
import java.util.ArrayList;

public class Libro extends Publicacion{
    
    public Libro(String nombre, ArrayList<Autor> autores, int anho, String edicion,
            String editorial, String lugar){
        super(nombre,autores,anho);
        this.edicion=edicion;
        this.editorial=editorial;
        this.lugar=lugar;
    }
    
    public Libro(String nombre, String autor, int anho, String edicion,
            String editorial, String lugar){
        super(nombre,autor,anho);
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
        String referencia = "";
        for (int i = 0; i < cantidad_autores; i++) {
            if (i != 0) {
                if (i == cantidad_autores - 1) {
                    referencia = referencia.concat(" and ");
                } else {
                    referencia = referencia.concat(", ");
                }
            }
            referencia = referencia.concat(autores.get(i).getApellidos());
            referencia = referencia.concat(", ");
            referencia = referencia.concat(autores.get(i).getNombres());
        }
        referencia = referencia.concat(". (");
        referencia = referencia.concat(anho.toString());
        referencia = referencia.concat("). ");        
        referencia = referencia.concat(nombre);
        referencia = referencia.concat(". ");
        referencia = referencia.concat(edicion);
        referencia = referencia.concat(". ");
        referencia = referencia.concat(lugar);
        referencia = referencia.concat(". ");
        referencia = referencia.concat(editorial);
        referencia = referencia.concat(". ");
        return referencia;
    }

    @Override
    public void metodoAbstracto() {
        
    }
    
}
