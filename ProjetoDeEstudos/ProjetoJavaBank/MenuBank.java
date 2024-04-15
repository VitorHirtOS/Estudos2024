package ProjetoDeEstudos.ProjetoJavaBank;

import java.util.Scanner;

public class MenuBank{

    private boolean paraOperacao;
    private String clienteOperacao;

    public void menu(){

        System.out.print("\033[H\033[2J");
        System.out.flush();

        while(!paraOperacao){

            System.out.printf("\n");
            System.out.printf("\u001B[31m |--------|      |    -- \u001B[31m\n");
            System.out.printf("\u001B[34m |         -|    |  --\u001B[34m\n");
            System.out.printf("\u001B[34m |   |--|   -|   | --\u001B[34m\n");
            System.out.printf("\u001B[34m |   |--|   -|   |-\u001B[34m\n");
            System.out.printf("\u001B[34m |        -|     |\u001B[34m\n");
            System.out.printf("\u001B[34m |   |--|   -|   |-\u001B[34m\n");
            System.out.printf("\u001B[34m |   |--|   -|   | --\u001B[34m\n");
            System.out.printf("\u001B[34m |         -|    |  --\u001B[34m\n");
            System.out.printf("\u001B[31m |--------|      |    --\u001B[31m\n");
            System.out.printf("\n");
            System.out.printf("\u001B[33m |---------------------------------------| \u001B[0m\n");
            System.out.printf("\u001B[33m |  1) Abrir Conta     \u001B[35m(Abrir --> A)\u001B[0m     \u001B[33m| \u001B[0m\n");
            System.out.printf("\u001B[33m |  2) Saldo Conta     \u001B[35m(Saldo --> S)\u001B[0m     \u001B[33m| \u001B[0m\n");
            System.out.printf("\u001B[33m |  3) Depósito Conta  \u001B[35m(Depósito --> D)\u001B[0m  \u001B[33m| \u001B[0m\n");
            System.out.printf("\u001B[33m |  4) Pagar Conta     \u001B[35m(Pagar --> P)\u001B[0m     \u001B[33m| \u001B[0m\n");
            System.out.printf("\u001B[33m |  5) Sair do Sistema \u001B[35m(Encerrar --> E)\u001B[0m  \u001B[33m| \u001B[0m\n");
            System.out.printf("\u001B[33m |---------------------------------------| \u001B[0m\n");
            System.out.printf("\n");

            // Scanner

            Scanner sc = new Scanner(System.in);

            // Entrada de dados do cliente

            System.out.print(" Qual operação: ");
            clienteOperacao = sc.nextLine();

            switch (clienteOperacao) {
                case "A":
                    System.out.println(" Opção escolhida (Abrir Conta)");
                    break;
                case "S":  
                    System.out.println(" Opção escolhida (Saldo Conta)"); 
                    break;        
                case "D":   
                    System.out.println(" Opção escolhida (Depósito Conta)"); 
                    break;        
                case "P":    
                    System.out.println(" Opção escolhida (Pagar Conta)");  
                    break;      
                case "E":  
                    System.out.println(" Opção escolhida (Sair do Sistema)"); 
                    paraOperacao = true; 
                    break;         
                default:
                    System.out.println(" Operação Inválida");                     
                    break;
            }

        }

    }

}