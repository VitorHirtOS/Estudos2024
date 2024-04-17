public class SaldoConta extends AbrirConta {


    public double saldoDaConta(double valor){

        return getSet(valor);
        
    }


    public SaldoConta(String name, int CVC, double salario, String senha){
        super(name, CVC, salario, senha);
    }
    
}
