using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta1
{
    public interface ICotizable
    {
        Vehiculo Vehiculo();
        string Descripcion();
        double CalcularCosto();
    }
}
