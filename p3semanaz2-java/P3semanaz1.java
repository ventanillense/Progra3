/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3semanaz1;

public class P3semanaz1 {

    public static void main(String[] args) {
        String[] autores = new String[]{ "Autor1", "Autor2", "Autor3", "Autor4" };
        Publicacion[] publicaciones = new Publicacion[3];
        
        publicaciones[0]=new Articulo("Titulo del articulo", "Autor del articulo",
                2023, "Revista Cientifica", 10, 2, "Marzo");
        
        publicaciones[1] = new Libro("Titulo del libro", autores, 2020, 
                "2da edicion", "Editorial XYZ", "Ciudad ABC");
        
        publicaciones[2] = new Tesis("Titulo de la tesis", "Autor de la tesis",
                2019, "Maestria", "Departamento de Ciencias", 
                "Universidad DEF","Ciudad GHI", "Estado JKL");
        
        for (Publicacion p : publicaciones){
            System.out.println(p.toString());
            Publicacion.orden_presentacion++;
        }
        
    }
}
