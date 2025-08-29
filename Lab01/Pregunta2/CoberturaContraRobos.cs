using Lab01.Pregunta1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta2
{
    public class CoberturaContraRobos: SeguroDecorador
    {
        public CoberturaContraRobos(ICotizable seguro) : base(seguro){}
        public override double CalcularCosto()
        {
            double costo = 100.00;
            if (this.seguro.Vehiculo().marca == Marca.Toyota)
            {
                costo += 100.00;
            }
            return this.seguro.CalcularCosto() + costo;
        }
        public override string Descripcion()
        {
            return this.seguro.Descripcion() + ", cobertura contra robos";
        }
    }
}
