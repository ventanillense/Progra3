using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p3semanaz1
{
    public class Articulo: Publicacion
    {
        public Articulo(string nombre, string autor, int anho, 
            string revista, int volumen, int numero, string mes) : base(nombre,
                autor,anho)
        {
            this.revista = revista;
            this.volumen = volumen;
            this.numero = numero;
            this.mes = mes;
        }

        private string revista;
        private int volumen;
        private int numero;
        private string mes;

        public string Revista { get => revista; set => revista = value; }
        public int Volumen { get => volumen; set => volumen = value; }
        public int Numero { get => numero; set => numero = value; }
        public string Mes { get => mes; set => mes = value; }

        public override string ToString()
        {
            string referencia = " " + mes;
            referencia += ". " + revista ;
            referencia += ", vol. " + volumen;
            referencia += ", no. " + numero;
            referencia += ".";
            return base.ToString()+referencia;
        }

        public override void MetodoAbstracto()
        {
            return;
        }
    }
}
