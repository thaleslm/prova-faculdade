import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
            Scanner entrada = new Scanner(System.in);
            System.out.println("digite seu nome, cidade, e idade");
            
            String nome = entrada.nextLine();
            String cidade = entrada.nextLine();
            String idade = entrada.nextLine();
            
            Pessoa funcionario = new Pessoa(nome ,cidade, idade);
            
            System.out.printf("nome: %s, idade: %s, cidade: %s ", funcionario.getNome(), funcionario.getIdade(), funcionario.getCidade());
         

            String funcao = "desenvolvedor"; 
            Double salario = 1000.0;
            Trabalho servico = new Trabalho(funcao, salario);
            servico.setRecebido();
            System.out.printf(", trabalha na funcao de %s, e recebe por ano %f",servico.getFuncao(), servico.getRecebido());

            String nomeemp = "Google";
            String endereco = "EUA";
            String areaAtuacao = "TI";

            Empresa google = new Empresa(nomeemp, endereco, areaAtuacao);
            System.out.printf(", na empresa %s, que atua na area de %s, nos %s, ", google.getNome(), google.getAreaAtuacao(), google.getEndereco());

            

        
        
        
       entrada.close();
    }
}
/* no mínimo 3 atributos;
método construtor utilizando os 3 atributos da classe */
