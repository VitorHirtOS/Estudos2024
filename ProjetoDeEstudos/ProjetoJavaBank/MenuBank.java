package ProjetoDeEstudos.ProjetoJavaBank;

import java.util.Scanner;

public class MenuBank {

    private boolean operacao = true;

    public void Menu(){
        
        while(operacao){
            System.out.println("|      Menu            |");
            System.out.println("|                      |");
            System.out.println("| 1 - Abrir conta      |");
            System.out.println("| 2 - Depositar        |");
            System.out.println("| 3 - Sacar            |");
            System.out.println("| 4 - Visualizar Saldo |");
            System.out.println("|                      |");
            System.out.println("|      End             |");

            Scanner scanner = new Scanner(System.in);

            int acaoDeOperacao = scanner.nextInt();


        }



    }

}
