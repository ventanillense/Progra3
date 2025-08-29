using Lab01.Pregunta1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta2
{
    public class SeguroDecorador: ICotizable
    {
        public SeguroDecorador(ICotizable seguro){
            this.seguro = seguro;
        }
        protected ICotizable seguro;
        public virtual double CalcularCosto()
        {
            return this.seguro.CalcularCosto();
        }
        public virtual string Descripcion()
        {
            return this.seguro.Descripcion();
        }
        public Vehiculo Vehiculo()
        {
            return this.seguro.Vehiculo();
        }
        public override string ToString()
        {
            return $"Precio: {this.CalcularCosto():F2}, Descripción: {this.Descripcion()}";
        }
    }
}
