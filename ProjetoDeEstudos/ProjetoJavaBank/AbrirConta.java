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
    public int validarIdade(){
    
        if(this.idade >= 18){
            System.out.println("É maior de idade pode criar a conta: " + this.idade);
            return this.idade;
        }

        System.out.println("É menor de idade e não pode criar conta: " + this.idade);
        return this.idade;

    }

    @Override
    public int valorPatrimonio(){

        try{

            if(this.patrimonio <= PlanoEscolhido.PADRAO.PADRAO()){
                System.out.println("Plano PADRAO: " + this.patrimonio);
                this.patrimonio = PlanoEscolhido.PADRAO.PADRAO();
                return this.patrimonio;
            }else if(this.patrimonio <= PlanoEscolhido.PREMIUM.PREMIUM()){
                System.out.println("Plano PREMIUM: " + this.patrimonio);
                this.patrimonio = PlanoEscolhido.PREMIUM.PREMIUM();
                return this.patrimonio;
            }else if(this.patrimonio <= PlanoEscolhido.STAR_PREMIUM.STAR_PREMIUM()){
                System.out.println("Plano STAR_PREMIUM: " + this.patrimonio);
                this.patrimonio = PlanoEscolhido.STAR_PREMIUM.STAR_PREMIUM();
                return this.patrimonio;
            }

            throw new ExceptionValorPatrimonio("Valor da operação é inválido");

        }catch(ExceptionValorPatrimonio ex){
            System.out.println(String.valueOf(ex));
            return 0;
        }

    }


    public String foiPossivelCriarAConta(){

        int idadeAtual = validarIdade();

        if(idadeAtual >= 18){
            System.out.println("Sua idade esta dentro do esperado: " + this.idade + " A conta foi criada :)");
            this.saldo = patrimonio; 
        }

        return "Sua idade não esta dentro do esperado >= 18: " + String.valueOf(this.idade); 

    }

    public void informacaoConta(){

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
