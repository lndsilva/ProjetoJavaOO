package PacoteJavaOO;

public class Cliente {
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private int cep;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    public void incluirNovoCliente(){
        System.out.println("Cliente incluido...");
    }
    public void atualizarCliente(){
        System.out.println("Cliente atualizado...");
    }
    
}
