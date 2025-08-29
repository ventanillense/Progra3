using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta1
{
    public class SeguroBasico: ICotizable
    {
        public SeguroBasico(Vehiculo v) 
        {
            vehiculo = v;
        }

        protected Vehiculo vehiculo;

        public virtual Vehiculo Vehiculo()
        {
            return vehiculo;
        }

        public virtual string Descripcion()
        {
            return "Seguro Basico Vehicular";
        }

        public virtual double CalcularCosto()
        {
            double costoBase = 500;
            if (vehiculo.antiguedad > 5){
                costoBase += 100;
            }
            if(vehiculo.antiguedad > 10){
                costoBase += 200;
            }
            if (vehiculo.marca==Marca.Mercedez || vehiculo.marca==Marca.Audi || vehiculo.marca==Marca.BMW){
                costoBase += 100;
            }

            return costoBase;
        }

        public override string ToString()
        {
            return $"Precio: {this.CalcularCosto():F2}, Descripción: {this.Descripcion()}";
        }

        
    }
}
