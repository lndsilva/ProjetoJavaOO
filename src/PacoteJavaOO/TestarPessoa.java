package PacoteJavaOO;

public class TestarPessoa {
    
    public static void main(String[] args) {
        
        //Vou utilizar a classe / Objeto Pessoa eu tenho que instânciar essa Classe
        
        //Para instânciar a classe pessoa
        //Preciso criar uma variável que de suporte ao dados da classe Pessoa
        
        //Criei uma variavel do tipo Pessoa
        
        Pessoa ps;
        
        //Instânciar a classe Pessoa e passar para variável ps
        ps = new Pessoa(); 
        
        ps.setNome("Maria Miranda Marinho");
        ps.setEmail("maria_miranda@etecia.com.br");
        ps.setTelefone("11-5555-5555");
        ps.setSexo('F');
        ps.setIdade(30);
        
        //String nome = ps.getNome();
                        
        System.out.println("Seu nome: "+ps.getNome()+"\n"
                + "Seu email: "+ps.getEmail()+"\n"
                        + "Seu telefone: "+ps.getTelefone()+"\n"
                                + "Seu sexo: "+ps.getSexo()+"\n"
                                        + "Sua idade: "+ps.getIdade()+"\n");
        
        ps.imprimirNome(ps.getIdade());
        
    }
    
}
