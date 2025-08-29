/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3semanaz1;

public class Articulo extends Publicacion {
    
    public Articulo(String nombre, String autor, int anho,
            String revista, int volumen, int numero, String mes){
        super(nombre,autor,anho);
        this.revista=revista;
        this.volumen=volumen;
        this.numero=numero;
        this.mes=mes;
    }
    
    private String revista;
    private int volumen;
    private int numero;
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
        String referencia = " " + mes;
        referencia += ". " + revista ;
        referencia += ", vol. " + volumen;
        referencia += ", no. " + numero;
        referencia += ".";
        return super.toString()+referencia;
    }
    
    @Override
    public void metodoAbstracto(){
        
    }
}
