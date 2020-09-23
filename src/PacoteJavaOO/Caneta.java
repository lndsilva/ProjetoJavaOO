package PacoteJavaOO;

public class Caneta {

//Atributos / propriedades / caracteristicas - Globais
    private String cor;
    private double tamanho;
    private String tipo;
    private String marca;
    private String modelo;
    private String corpo;
    private double durabilidade;
    private String tipo_de_ponta;
    private boolean tampa;
    private boolean resistencia;
    private double preco;
    private int lote;

    //Método construtor - auxiliar na criação ou instância do objeto Caneta
    
    //sobrecarga de métodos construtores
    public Caneta() {
    }

    public Caneta(String cor, double tamanho, String tipo, String marca, String modelo, String corpo, double durabilidade, String tipo_de_ponta, boolean tampa, boolean resistencia, double preco, int lote) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.corpo = corpo;
        this.durabilidade = durabilidade;
        this.tipo_de_ponta = tipo_de_ponta;
        this.tampa = tampa;
        this.resistencia = resistencia;
        this.preco = preco;
        this.lote = lote;
    }

    public Caneta(String cor, String marca, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public Caneta(String tipo, String marca, String modelo, double preco) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;

    }

    public Caneta(double durabilidade, String tipo_de_ponta) {
        this.durabilidade = durabilidade;
        this.tipo_de_ponta = tipo_de_ponta;
    }
    

    //Criando os métodos getters e setters - tecla alt+insert 
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public double getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(double durabilidade) {
        this.durabilidade = durabilidade;
    }

    public String getTipo_de_ponta() {
        return tipo_de_ponta;
    }

    public void setTipo_de_ponta(String tipo_de_ponta) {
        this.tipo_de_ponta = tipo_de_ponta;
    }

    public boolean isTampa() {
        return tampa;
    }

    public void setTampa(boolean tampa) {
        this.tampa = tampa;
    }

    public boolean isResistencia() {
        return resistencia;
    }

    public void setResistencia(boolean resistencia) {
        this.resistencia = resistencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    //Criando os métodos específicos da classe Caneta
    public void escrever() {

        System.out.println("Escrevendo...");

    }

    public void pintar() {
        System.out.println("Pintando....");
    }

    public void desenhar() {
        System.out.println("Desenhando...");
    }

    public void tampar() {
        System.out.println("Tampando...");
    }

}
