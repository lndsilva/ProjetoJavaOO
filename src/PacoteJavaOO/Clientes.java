package PacoteJavaOO;

public class Clientes {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    
    //criar o método construtor da classe Clientes
    
    public Clientes(){
        
    }

    //criando os métodos de acesso
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //criar os métodos da classe Cliente
    public void incluir() {
        System.out.println("método incluir");
    }

    public void alterar() {
        System.out.println("método alterar");
    }

    public void excluir() {
        System.out.println("método excluir");
    }

    public void pesquisar() {
        System.out.println("método pesquisar");
    }

}
