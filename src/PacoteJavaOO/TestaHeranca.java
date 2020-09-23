package PacoteJavaOO;

public class TestaHeranca {

    public static void main(String[] args) {

        Pessoa_Fisica pf = new Pessoa_Fisica();

        //Parte herdada da classe cliente
        pf.setNome("Chico Antunes");
        pf.setEndereco("Rua das Flores, 55");
        pf.setCidade("São Paulo");
        pf.setUf("SP");

        //parte da classe pessoa fisica
        pf.setCpf("111.222.333-44");
        pf.setRg("22.888.111-7");
        pf.setSexo('M');
        pf.setData_nascimento(25091898);
        
        System.out.println("Pessoal Física \n");

        System.out.println("Seu nome: " + pf.getNome()
                + "\nSeu endereço: " + pf.getEndereco()
                + "\nSua cidade: " + pf.getCidade()
                + "\nSeu estado: " + pf.getUf()
                + "\nSeu CPF: " + pf.getCpf()
                + "\nSeu RG: " + pf.getRg()
                + "\nSeu sexo: " + pf.getSexo()
                + "\nSua data de nascimento: " + pf.getData_nascimento()+"\n");

        System.out.println("Pessoa Jurídica \n");
        
        Pessoa_Juridica pj = new Pessoa_Juridica();
        
        
        
        //Parte herdada da classe cliente
        pj.setNome("Chico Antunes");
        pj.setEndereco("Rua das Flores, 55");
        pj.setCidade("São Paulo");
        pj.setUf("SP");

        //parte da classe pessoa juridica
        pj.setCnpj("111.111.0001/11");
        pj.setInscricao_estadual("123.123.123-44");
        pj.setRazao_social("Empresa Chico Antunes");
        
        System.out.println("Seu nome: " + pj.getNome()
                + "\nSeu endereço: " + pj.getEndereco()
                + "\nSua cidade: " + pj.getCidade()
                + "\nSeu estado: " + pj.getUf()
                + "\nSeu CNPJ: " + pj.getCnpj()
                + "\nSeu IE: " + pj.getInscricao_estadual()
                + "\nSeu Razão social: " + pj.getRazao_social());
        
        
    }

}
