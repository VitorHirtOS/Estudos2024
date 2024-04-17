import java.util.ArrayList;
import java.util.Random;

public class AbrirConta{
    
    // Construtor Atributos

    private String name;
    private int idade;
    private double salario;
    private String senha;

    // Classe Atributos mutáveis

    private int idConta;
    private int CVC;
    private String numeroCard;
    private String vencimentoCard;
    private final ArrayList<String> INFORMACAOCLIENTE = new ArrayList<String>();
    private int limite;
    private String status;
    
    // Método --> CriacaoConta <--

    private boolean criacaoConta() {
        if (this.idade >= 18 && this.salario >= 500) {
            Random valorRandom = new Random();
    
            if (this.salario > 0 && this.salario <= 4000) {
                this.limite = Planos.BASIC.BASIC();
            } else if (this.salario > 4000 && this.salario <= 9000) {
                this.limite = Planos.PREMIUM.PREMIUM();
            } else if (this.salario > 9000) {
                this.limite = Planos.STAR_PREMIUM.STAR_PREMIUM();
            }
    
            this.idConta = valorRandom.nextInt(500) + 501;
            this.CVC = valorRandom.nextInt(100) + 1000;
            this.status = "\u001B[32mAtivo\u001B[00m";
    
            StringBuilder cartaoBuilder = new StringBuilder();
    
            for (int i = 0; i < 4; i++) {
                cartaoBuilder.append(String.format("%04d", valorRandom.nextInt(10000)));
                if (i < 3) {
                    cartaoBuilder.append(",");
                }
            }
    
            this.numeroCard = cartaoBuilder.toString();
    
            INFORMACAOCLIENTE.add("Limite: " + String.valueOf(this.limite));
            INFORMACAOCLIENTE.add("ID da Conta: " + String.valueOf(this.idConta));
            INFORMACAOCLIENTE.add("CVC: " + String.valueOf(this.CVC));
            INFORMACAOCLIENTE.add("Número do Cartão: " + this.numeroCard);
            INFORMACAOCLIENTE.add("Status: " + this.status);
            INFORMACAOCLIENTE.add("Nome: " + this.name);
    
            return true;
        }
    
        System.out.println(" Não é possível abrir a conta");
        return false;
    }
    

    // Método --> Método informacaoUsuario <--

    public ArrayList<String> informacaoUsuario(){

        criacaoConta();
        return this.INFORMACAOCLIENTE;

    }

    // Construtor

    public AbrirConta(String name, int idade, double salario){
        this.name = name;
        this.idade = idade;
        this.salario = salario;
    }

}
