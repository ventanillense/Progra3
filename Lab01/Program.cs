using System;
using Lab01.Pregunta1;
using Lab01.Pregunta2;

namespace Lab01
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Vehiculo vehiculo = new Vehiculo
            {
                antiguedad = 10,
                marca = Marca.Toyota
            };
            Console.WriteLine("===== SEGUROS PREDEFINIDOS =====");
            ICotizable seguro = new SeguroBasico(vehiculo);
            Console.WriteLine(seguro);
            seguro = new SeguroBronce(vehiculo);
            Console.WriteLine(seguro);
            seguro = new SeguroPlata(vehiculo);
            Console.WriteLine(seguro);
            seguro = new SeguroOro(vehiculo);
            Console.WriteLine(seguro);


            Console.WriteLine("\n===== SEGUROS DECORADOS (Patrón Decorador) =====");
            seguro = new SeguroBasico(vehiculo);
            Console.WriteLine(seguro);
            seguro = new SeguroBasico(vehiculo)
            .ConCoberturaContraRobos();
            Console.WriteLine(seguro);
            seguro = new SeguroBasico(vehiculo)
            .ConCoberturaContraRobos()
            .ConAsistenciaVial();
            Console.WriteLine(seguro);
            seguro = new SeguroBasico(vehiculo)
            .ConCoberturaContraRobos()
            .ConAsistenciaVial()
            .ConCoberturaContraDesastresNaturales();
            Console.WriteLine(seguro);
        
        }
    }
}
