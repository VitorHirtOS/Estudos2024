using System;
using POO;

namespace App
{
    
    class Program{

        public static void Main(string[] args){

            Console.WriteLine("Hello, world!!!");

            PooCs pooCs= new PooCs();

            string nomeDaLinguagem = pooCs.csharp();

            Console.WriteLine(nomeDaLinguagem);

        }

    }

}