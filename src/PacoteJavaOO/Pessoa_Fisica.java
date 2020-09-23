
package PacoteJavaOO;

public class Pessoa_Fisica extends Cliente{
    private String cpf;
    private String rg;
    private char sexo;
    private int data_nascimento;

    public Pessoa_Fisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(int data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    public void validarCPF(){
        System.out.println("CPF validado...");
    }
}
