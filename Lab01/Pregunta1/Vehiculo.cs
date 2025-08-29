using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab01.Pregunta1
{
    public class Vehiculo
    {
        public Vehiculo() { }
        private Marca Marca;
        private int Antiguedad;


        public int antiguedad { get => Antiguedad; set => Antiguedad = value; }
        public Marca marca { get => Marca; set => Marca = value; }
    }
}
