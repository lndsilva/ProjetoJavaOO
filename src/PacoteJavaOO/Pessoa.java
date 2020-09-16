package PacoteJavaOO;

//Criando o objeto / Classe Pessoa
public class Pessoa {
    //criando os atributos da classe Pessoa

    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private char sexo;

    //criar os getters e setters - alt+insert
    //pegar as informações da variável - ler
    public String getNome() {
        return nome;
    }

    //pegar as informações e passar para a variável - escreve
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void imprimirNome(Object qualquercoisa){
        System.out.println("Estou imprimindo classe Pessoa - "+qualquercoisa);
    }
}
