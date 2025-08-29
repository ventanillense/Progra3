using Lab01.Pregunta1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta2
{
    public class CoberturaAsistenciaVial : SeguroDecorador
    {
        public CoberturaAsistenciaVial(ICotizable seguro) : base(seguro){}
        public override double CalcularCosto()
        {
            return this.seguro.CalcularCosto() + 100.00;
        }
        public override string Descripcion()
        {
            return this.seguro.Descripcion() + ", asistencia vial";
        }
    }
}
