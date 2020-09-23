package PacoteJavaOO;

public class TestaCaneta {

    public static void main(String[] args) {

        //Criando uma variável que suporte o objeto Caneta.
        Caneta caneta;

        //Instânciar o objeto Caneta - utilizar o objeto Caneta
        caneta = new Caneta();

        caneta.setCor("Outra cor");
        caneta.setMarca("Outra marca");

        System.out.println("A cor da caneta é: " + caneta.getCor() + " e a marca é " + caneta.getMarca());

        //Instânciar o objeto Caneta com o construtor com parâmetros;
        Caneta caneta1 = new Caneta("Vermelha", "Ferrari", 500.00);

        System.out.println("A cor da caneta "
                + caneta1.getCor()
                + " a sua marcar " + caneta1.getMarca()
                + " o preço " + caneta1.getPreco() + "\n\n");

        Caneta caneta2 = new Caneta("Amarela", 1.5, "Esferográfica", "Gold", "Gold New", "Redondo", 1, "Redonda", true, true, 25.00, 123456);

        System.out.println("Cor: " + caneta2.getCor()
                + "\nTamanho: " + caneta2.getTamanho()
                + "\nTipo: " + caneta2.getTipo()
                + "\nMarca: " + caneta2.getMarca()
                + "\nModelo: " + caneta2.getModelo()
                + "\nCorpo: " + caneta2.getCorpo()
                + "\nDurabilidade: " + caneta2.getDurabilidade()
                + "\nTipo de ponta: " + caneta2.getTipo_de_ponta()
                + "\nTem Tampa: " + caneta2.isTampa()
                + "\nResistência: " + caneta2.isResistencia()
                + "\nPreço: " + caneta2.getPreco()
                + "\nLote: " + caneta2.getLote());
    }
}
