package PacoteJavaOO;

public class Produtos {

    private int codigo;
    private String nome;
    private String descricao;
    private double preco_compra;
    private double preco_venda;
    private int quantidade_estoque;
    private boolean ativo;
    private String data_cadastro;
    
    //criando o método construtor alt+insert

    public Produtos() {
    }
    

    //criando os métodos de acesso - alt + insert
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    //criar os métodos da classe Produto

    public void inserir() {

    }

    public void alterar() {

    }

    public void excluir() {

    }

    public void pesquisar() {

    }

}
