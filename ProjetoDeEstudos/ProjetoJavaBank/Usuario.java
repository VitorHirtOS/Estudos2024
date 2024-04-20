public class Usuario {

    private String nome;
    private int idade;
    
    public void setIdade(int valor){
        this.idade = valor;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getName(){
        return this.nome;
    }

    public Usuario(String nome){
        this.nome = nome;
    }

}
