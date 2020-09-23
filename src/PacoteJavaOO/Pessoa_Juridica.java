package PacoteJavaOO;

public class Pessoa_Juridica extends Cliente{
    private String cnpj;
    private String inscricao_estadual;
    private String razao_social;

    public Pessoa_Juridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    
    public void validaCNPJ(){
        System.out.println("CPNJ validado...");
    }
}
