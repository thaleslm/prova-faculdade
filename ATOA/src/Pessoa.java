public class Pessoa {
    private String nome;
    private String cidade;
    private String idade;

    public Pessoa(String nome, String cidade, String idade){
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }
    public void setNome(String nome){
       this.nome = nome ;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setIdade(String idade){
        this.idade = idade;
    }
    
    
    public String getNome(){
        return this.nome;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getIdade(){
        return this.idade;
    }
    



}
/* 
no mínimo 3 atributos;
método construtor utilizando os 3 atributos da classe
 */