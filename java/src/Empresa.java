public class Empresa {
    private String nome;
    private String endereco;
    private String areaAtuacao;

    public Empresa(String nome, String endereco, String areaAtuacao){
        this.nome = nome;
        this.endereco= endereco;
        this.areaAtuacao = areaAtuacao;

    }
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
