using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p3semanaz1
{
    public class Libro: Publicacion
    {
        public Libro(string nombre, string autor, int anho, string edicion,
            string editorial, string lugar): base(nombre,autor,anho)
        {
            this.edicion = edicion;
            this.editorial = editorial;
            this.lugar = lugar;
        }

        private string editorial;
        private string edicion;
        private string lugar;

        public string Editorial { get => editorial; set => editorial = value; }
        public string Edicion { get => edicion; set => edicion = value; }
        public string Lugar { get => lugar; set => lugar = value; }

        public override string ToString()
        {
            string referencia = " " + edicion + " ed.";
            referencia += ". " + lugar;
            referencia += ": " + editorial;
            return base.ToString() + referencia;
        }

        public override void MetodoAbstracto()
        {
            return;
        }
    }
}
