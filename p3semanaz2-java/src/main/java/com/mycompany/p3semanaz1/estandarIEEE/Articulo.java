/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.p3semanaz1.estandarIEEE;
import com.mycompany.p3semanaz1.Autor;
import com.mycompany.p3semanaz1.Publicacion;
import java.util.ArrayList;

public class Articulo extends Publicacion {
    
    public Articulo(String nombre, ArrayList<Autor> autor, Integer anho,
            String revista, Integer volumen, Integer numero, String mes){
        super(nombre,autor,anho);
        this.revista=revista;
        this.volumen=volumen;
        this.numero=numero;
        this.mes=mes;
    }
    
    public Articulo(String nombre, String autor, Integer anho,
            String revista, Integer volumen, Integer numero, String mes){
        super(nombre,autor,anho);
        this.revista=revista;
        this.volumen=volumen;
        this.numero=numero;
        this.mes=mes;
    }
    
    private String revista;
    private Integer volumen;
    private Integer numero;
    private String mes;
    
    public String getRevista() {
        return revista;
    }
    
    public void setRevista(String revista) {
        this.revista = revista;
    }
    
    public int getVolumen() {
        return volumen;
    }
    
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getMes() {
        return mes;
    }
    
    public void setMes(String mes) {
        this.mes = mes;
    }
    
    @Override
    public String toString(){
        String referencia = "[" + Publicacion.orden_presentacion.toString() + "]";
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
        referencia = referencia.concat(", \"");
        referencia = referencia.concat(nombre);
        referencia = referencia.concat("\", "); 
        referencia = referencia.concat(revista);
        referencia = referencia.concat(", vol. ");
        referencia = referencia.concat(volumen.toString());
        referencia = referencia.concat(", no. ");
        referencia = referencia.concat(numero.toString());
        referencia = referencia.concat(", ");
        referencia = referencia.concat(mes);
        referencia = referencia.concat(" ");
        referencia = referencia.concat(anho.toString());
        referencia = referencia.concat(". ");
        return referencia;
    }
    
    @Override
    public void metodoAbstracto(){
        
    }
}
