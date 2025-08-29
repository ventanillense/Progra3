using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p3semanaz1
{
    public class Tesis: Publicacion
    {
        public Tesis(string nombre, string autor, int anho,
            string clase, string departamento, string institucion,
            string ciudad, string estado) : base(nombre, autor, anho)
        {
            this.clase = clase;
            this.departamento = departamento;
            this.institucion = institucion;
            this.ciudad = ciudad;
            this.estado = estado;
        }

        private string clase;
        private string departamento;
        private string institucion;
        private string ciudad;
        private string estado;

        public string Clase { get => clase; set => clase = value; }
        public string Departamento { get => departamento; set => departamento = value; }
        public string Institucion { get => institucion; set => institucion = value; }
        public string Ciudad { get => ciudad; set => ciudad = value; }
        public string Estado { get => estado; set => estado = value; }

        public override string ToString()
        {
            string referencia = " " + "Tesis de " + clase;
            referencia += ", " + departamento;
            referencia += ", " + institucion;
            referencia += ", " + ciudad;
            referencia += ", " + estado;
            return base.ToString() + referencia;
        }

        public override void MetodoAbstracto()
        {
            return;
        }
    }
}
