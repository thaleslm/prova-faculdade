public class Trabalho {
    private String funcao;
    private int Mesano = 12;
    Double salario;
    private Double Recebido;

    public Trabalho(String funcao, Double salario){
        this.funcao = funcao;
        this.salario = salario;
        
    }

    public void setRecebido(){
        int tempo = this.Mesano ;
        this.Recebido = this.salario * tempo;
       
    }

    

    public String getFuncao(){
        return this.funcao ;
        
    }
    public Double getRecebido(){
        return this.Recebido;
    }








}
