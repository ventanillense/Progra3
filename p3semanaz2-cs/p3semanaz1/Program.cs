using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p3semanaz1
{
    public class Program
    {
        static void Main(string[] args)
        {
            //Publicacion publicacion = new Publicacion("El viejo y el mar", "Ernest Hemingway", 1951);
            string[] autores = new string[] { "Autor1", "Autor2", "Autor3", "Autor4" };

            Publicacion[] publicaciones = new Publicacion[3];

            // La clase Publicacion es abstracta, no se puede instanciar directamente
            //publicaciones[0] = new Publicacion("Titulo del libro", autores, 2025);
            //System.Console.WriteLine(publicaciones[0]);

            publicaciones[0] = new Articulo("Titulo del articulo", "Autor del articulo", 2023, "Revista Cientifica", 10, 2, "Marzo");
            //System.Console.WriteLine(publicaciones[1]);

            publicaciones[1] = new Libro("Titulo del libro", "Autor del libro", 2020, "2da edicion", "Editorial XYZ", "Ciudad ABC");
            //System.Console.WriteLine(publicaciones[2]);

            publicaciones[2] = new Tesis("Titulo de la tesis", "Autor de la tesis", 2019, "Maestria", "Departamento de Ciencias", "Universidad DEF", "Ciudad GHI", "Estado JKL");
            //System.Console.WriteLine(publicaciones[3]);

            foreach (var pub in publicaciones)
            {
                System.Console.WriteLine(pub);
                Publicacion.orden_presentacion++;
            }
        }
    }
}
