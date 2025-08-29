using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta1
{
    public class SeguroBronce : SeguroBasico
    {
        public SeguroBronce(Vehiculo v) : base(v){}

        public override double CalcularCosto()
        {
            double costo = base.CalcularCosto()+100;
            if (vehiculo.marca == Marca.Toyota) costo += 100;
            return costo;
        }
        public override string Descripcion()
        {
            return base.Descripcion() + " + cobertura contra robos";
        }
    }
}
