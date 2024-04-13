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
            System.out.println("|      End             |\n");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha uma operacao: ");
            int acaoDeOperacao = scanner.nextInt();
            
            switch (acaoDeOperacao) {
                case 1:
                    System.out.println("Operação escolhida Abrir conta\n");

                    System.out.println("Qual o seu nome: \n");
                    String nome = scanner.next();
                    scanner.nextLine();

                    System.out.println("Qual o sua idade: \n");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Qual o seu patrimonio: \n");
                    int patrimonio = scanner.nextInt();
                    scanner.nextLine();

                    AbrirConta abrirConta = new AbrirConta(nome, idade, patrimonio);

                    System.out.println(abrirConta.valorPatrimonio());
                    System.out.println(abrirConta.validarIdade());

                    break;
                case 2:
                case 3:
                case 4:
                default:
                    break;
            }


        }



    }

}
