using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p3semanaz1
{
    public abstract class Publicacion
    {
        public Publicacion() { }

        public Publicacion(string nombre, string autor, int anho) 
        {
            this.nombre = nombre;
            this.autores = new string[1];
            this.autores[0] = autor;
            this.cantidad_autores = 1;
            this.anho = anho;
        }

        public Publicacion(string nombre, string[] autores, int anho)
        {
            this.nombre = nombre;
            this.autores = new string[autores.Length];
            for (int i = 0; i < autores.Length; i++)
            {
                this.autores[i] = autores[i];
            }
            this.cantidad_autores = autores.Length;
            this.anho = anho;
        }

        public Publicacion(Publicacion p)
        {
            this.nombre = p.nombre;
            this.autores = new string[p.cantidad_autores];
            for (int i = 0; i < p.cantidad_autores; i++)
            {
                this.autores[i] = p.autores[i];
            }
            this.cantidad_autores = p.cantidad_autores;
            this.anho = p.anho;
        }

        public static int orden_presentacion=1; // Miembro estático de la clase

        private string nombre;
        private string[] autores;
        private int cantidad_autores;
        private int anho;

        public string Nombre
        {
            get { return nombre; }
            set { nombre = value; }
        }
        public int Anho
        {
            get { return anho; }
            set { anho = value; }
        }
        public int CantidadAutores
        {
            get { return cantidad_autores; }
            set { cantidad_autores = value; }
        }

        public override string ToString()
        {
            string referencia = "[" + Publicacion.orden_presentacion + "] ";
            for (int i = 0; i < cantidad_autores; i++)
            {
                referencia += autores[i];
                if(i < cantidad_autores - 2)
                    referencia += ", ";
                else if(i == cantidad_autores - 2)
                    referencia += " and ";
            }
            referencia += ". ";
            referencia += nombre;
            referencia += ". ";
            referencia += anho;
            referencia += ".";
            return referencia;
        }

        // Esto es el análogo a un método virtual puro en C++
        public abstract void MetodoAbstracto();
    }
}
