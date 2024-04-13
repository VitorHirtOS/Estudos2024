package ProjetoDeEstudos.ProjetoJavaBank;

public class AbrirConta implements logicaDoSistema {
    
    String nome;
    int idade;
    int saldo;
    int limite;
    int patrimonio;
    int numeroDaConta;
    int cvc;
    int dataVencimento;

    @Override
    public String validarIdade(){
    
        if(this.idade >= 18){
            return "É maior de idade pode criar a conta: " + this.idade;
        }

        return "É menor de idade e não pode criar conta: "+ this.idade;

    }

    @Override
    public int valorPatrimonio(){
        return 0;
    }

    // Construtor de uso - classe - MenuBank
    public AbrirConta(String nome, 
        int idade, 
        int saldo, 
        int limite, 
        int numeroDaConta, 
        int cvc, 
        int dataVencimento){

            this.nome = nome;
            this.idade = idade;
            this.saldo = saldo;
            this.limite = limite;
            this.numeroDaConta = numeroDaConta;
            this.cvc = cvc;
            this.dataVencimento = dataVencimento;

    }

}
