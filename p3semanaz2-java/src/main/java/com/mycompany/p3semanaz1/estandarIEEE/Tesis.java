/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.p3semanaz1.estandarIEEE;
import com.mycompany.p3semanaz1.Autor;
import com.mycompany.p3semanaz1.Clase_de_Tesis;
import com.mycompany.p3semanaz1.Publicacion;
import java.util.ArrayList;

public class Tesis extends Publicacion{
    
    public Tesis(String nombre, ArrayList<Autor> autores, int anho, Clase_de_Tesis clase, String departamento,
            String institucion, String ciudad, String estado){
        super(nombre,autores,anho);
        this.clase=clase;
        this.departamento=departamento;
        this.institucion=institucion;
        this.ciudad=ciudad;
        this.estado=estado;
    }
    
    public Tesis(String nombre, String autor, int anho, Clase_de_Tesis clase, String departamento,
            String institucion, String ciudad, String estado){
        super(nombre,autor,anho);
        this.clase=clase;
        this.departamento=departamento;
        this.institucion=institucion;
        this.ciudad=ciudad;
        this.estado=estado;
    }
    
    private Clase_de_Tesis clase;
    private String departamento;
    private String institucion;
    private String ciudad;
    private String estado;
    
    public Clase_de_Tesis getClase() {
        return clase;
    }
    public void setClase(Clase_de_Tesis clase) {
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
        referencia = referencia.concat(", ");
        referencia = referencia.concat(nombre);
        referencia = referencia.concat(", ");
        referencia = referencia.concat("Tesis de ");
        referencia = referencia.concat(clase.toString());
        referencia = referencia.concat(", ");
        referencia = referencia.concat(departamento);
        referencia = referencia.concat(", ");
        referencia = referencia.concat(institucion);
        referencia = referencia.concat(", ");
        referencia = referencia.concat(ciudad);
        referencia = referencia.concat(", ");
        referencia = referencia.concat(estado);
        referencia = referencia.concat(", ");
        referencia = referencia.concat(anho.toString());
        referencia = referencia.concat(". ");
        return referencia;
    }
    
    @Override
    public void metodoAbstracto() {
        
    }
    
}
