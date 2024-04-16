

import java.util.ArrayList;
import java.util.Random;

public class AbrirConta{
    
    // Construtor Atributos

    private String name;
    private int idade;
    private double salario;

    // Classe Atributos imutáveis

    private int idConta;
    private int CVC;
    private String numeroCard;
    private String vencimentoCard;

    // Classe Atributos mutáveis

    private int limite;
    
    // Método --> CriacaoConta <--

    private ArrayList<String> criacaoConta(){

        final ArrayList<String> INFORMACAOCLIENTE = new ArrayList<String>();
        
        if(this.idade >= 18 && this.salario >= 500){
            
            PLANOS planos;

            if(this.salario > 0 && this.salario < 4000){
                
                this.limite = planos.BASIC();

                Random valorRandom = new Random();


                this.idConta = valorRandom.nextInt(1) + 500;
                this.CVC = valorRandom.nextInt(100) + 999;
                

            }else if(this.salario > 4000 && this.salario < 9000){
                this.limite = planos.PREMIUM();
            }else{
                this.limite = planos.STAR_PREMIUM();
            }
            
            return INFORMACAOCLIENTE;
        }

        return INFORMACAOCLIENTE;
    }


    // Construtor

    public AbrirConta(String name, int idade, double salario){
        this.name = name;
        this.idade = idade;
        this.salario = salario;
    }

}
