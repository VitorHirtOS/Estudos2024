import java.util.Scanner;

public class Menu {
    
    private boolean isValid = false;
    private boolean isValidSalario = true;
    private int isValidIdade;

    public void menu(){

        ContaBancaria contaBancaria = new ContaBancaria();

        while(!isValid){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual a sua operação: [SA] - [C] - [D] - [P] - [U] - [.]");
            String acao = scanner.nextLine().toUpperCase();

            switch (acao) {
                case "SA":

                    if(isValidSalario){
                        if(isValidIdade > 18){
                            System.out.println("Valor do salário: ");
                            int salario = scanner.nextInt();
                            scanner.nextLine();
                            contaBancaria.SaldoSalario(salario);
                            isValidSalario = false;
                            break;
                        }
                        System.out.println("Você é menor de idade ou não criou a a conta");
                        break;
                    }

                    System.out.println("Esta operação não está mais dispoível");
                    

                    break;
                case "C":

                    if(isValidSalario == false){
                        System.out.println("Saldo da conta: " + contaBancaria.GetSaldo());
                        break;
                    }

                    System.out.println("A conta não foi criada ainda!!!");

                    break;
                case "D":

                    if(isValidSalario == false){
                        System.out.print("Valor para depositar: ");
                        int depostio = scanner.nextInt();
                        scanner.nextLine();
                        contaBancaria.Depostio(depostio);
                        break;
                    }

                    System.out.println("A conta não foi criada ainda!!!");

                    break;
                case "P":

                    if(isValidSalario != true){
                        System.out.println("Valor a pagar");
                        int pagar = scanner.nextInt();
                        contaBancaria.Pagar(pagar);
                        break;
                    }

                    System.out.println("A conta não foi criada ainda!!!");

                    break;
                case "U":

                    System.out.print("Seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Sua idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    isValidIdade = idade;

                    Usuario usuario = new Usuario(nome);
                    usuario.setIdade(idade);

                    break;
                default:
                    System.err.println("Saindo do sistema!!!");
                    isValid = true;
                    break;
            }

        }

    }

}
