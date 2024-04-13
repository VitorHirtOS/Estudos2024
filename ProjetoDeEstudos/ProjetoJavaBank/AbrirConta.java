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

        return "É menor de idade e não pode criar conta: " + this.idade;

    }

    @Override
    public String valorPatrimonio(){

        try{

            if(this.patrimonio <= PlanoEscolhido.PADRAO.PADRAO()){
                return "Plano consedido é o PADRAO: " + String.valueOf(this.patrimonio);
            }else if(this.patrimonio <= PlanoEscolhido.PREMIUM.PREMIUM()){
                return "Plano consedido é o PREMIUM: " + String.valueOf(this.patrimonio);
            }else if(this.patrimonio <= PlanoEscolhido.STAR_PREMIUM.STAR_PREMIUM()){
                return "Plano consedido é o STAR_PREMIUM: " + String.valueOf(this.patrimonio);
            }

            throw new ExceptionValorPatrimonio("Valor da operação é inválido");

        }catch(ExceptionValorPatrimonio ex){
            return String.valueOf(ex);
        }

    }

    // Construtor de uso - classe - MenuBank
    public AbrirConta(String nome, 
        int idade, 
        int patrimonio){
            this.nome = nome;
            this.idade = idade;
            this.patrimonio = patrimonio;
    }

}
