using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta1
{
    public class SeguroPlata : SeguroBronce
    {
        public SeguroPlata(Vehiculo v) : base(v){}

        public override double CalcularCosto()
        {
            return base.CalcularCosto()+100;
        }
        public override string Descripcion()
        {
            return base.Descripcion() + " + asistencia vial";
        }
    }
}
