/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3semanaz1;
import com.mycompany.p3semanaz1.estandarAPA.Tesis;
import com.mycompany.p3semanaz1.estandarAPA.Articulo;
import com.mycompany.p3semanaz1.estandarAPA.Libro;
import java.util.ArrayList;
import com.mycompany.p3semanaz1.estandarAPA.ConcreteFactoryAPA;
import com.mycompany.p3semanaz1.estandarIEEE.ConcreteFactoryIEEE;

public class P3semanaz1 {

    public static void main(String[] args) {
        AbstractFactoryPublicacion factoryIEEE = new ConcreteFactoryIEEE();
        AbstractFactoryPublicacion factoryAPA = new ConcreteFactoryAPA();
        
        String[] autores1 = new String[]{ "1,Autor", "2,Autor", "3,Autor", "4,Autor" };
        Autor[] autores = new Autor[4];
        autores[0]=new Autor("Autor","1");
        autores[1]=new Autor("Autor","2");
        autores[2]=new Autor("Autor","3");
        autores[3]=new Autor("Autor","4");
        
        ArrayList<Autor> autoresList = new ArrayList<>();
        autoresList.add(0, autores[0]);
        autoresList.add(1, autores[1]);
        autoresList.add(2, autores[2]);
        autoresList.add(3, autores[3]);
        
        Publicacion[] publicaciones = new Publicacion[3];
        
        publicaciones[0]=factoryAPA.crearArticulo("Titulo del articulo", autores1[0],
                2023, "Revista Cientifica", 10, 2, "Marzo");
        
        publicaciones[1] = factoryIEEE.crearLibro("Titulo del libro", autoresList, 2020, 
                "2da edicion", "Editorial XYZ", "Ciudad ABC");
        
        publicaciones[2] = factoryIEEE.crearTesis("Titulo de la tesis", autores1[3],
                2019, Clase_de_Tesis.Maestria, "Departamento de Ciencias", 
                "Universidad DEF","Ciudad GHI", "Estado JKL");
        
        for (Publicacion p : publicaciones){
            System.out.println(p.toString());
            Publicacion.orden_presentacion++;
        }
        
    }
}
