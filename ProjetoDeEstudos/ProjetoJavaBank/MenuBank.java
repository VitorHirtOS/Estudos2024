package ProjetoDeEstudos.ProjetoJavaBank;

import java.util.Scanner;

public class MenuBank {

    private boolean operacao = true;
    private boolean excecao = false;

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

            System.out.println("Escolha uma operacao: \n");
            int acaoDeOperacao = scanner.nextInt();
            
            switch (acaoDeOperacao){
                case 1:
                    try{

                        while(!excecao){
                            System.out.println("Operação escolhida Abrir conta\n");
                        
                            System.out.println("Qual o seu nome: \n");
                            String nome = scanner.next();
                            scanner.nextLine();
    
                            System.out.println("Qual o sua idade: \n");
                            int idade;

                            if(scanner.hasNextInt()){
                                idade = scanner.nextInt();
                            }else{
                                throw new ExceptionAcaoMenu("Operação Inválida!!!");
                            }
                            scanner.nextLine();

                            System.out.println("Qual o seu patrimonio: \n");
                            int patrimonio = scanner.nextInt();

                            if(scanner.hasNextInt()){
                                patrimonio = scanner.nextInt();
                            }else{
                                throw new ExceptionAcaoMenu("Operação Inválida!!!");  
                            }
    
                            AbrirConta abrirConta = new AbrirConta(nome, idade, patrimonio);
                            abrirConta.foiPossivelCriarAConta();
                        
                        }
                       
                    }catch(ExceptionAcaoMenu Ex){
                        System.out.println("Erro de operação: " + Ex.getMessage());
                    }
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
