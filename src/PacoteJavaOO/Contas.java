package PacoteJavaOO;

public class Contas {

    private int numero;
    private double saldo;
    private String dataAbertura;
    private boolean status;
    
    //criando o método construtor alt+insert

    public Contas() {
    }
    

    //criar os métodos de acesso com alt+insert
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //criar os métodos da classe Conta
    public void criar() {

    }

    public void bloquear() {

    }

    public boolean desbloquear() {
        return isStatus();
    }

    public void creditar(double valor) {

    }

    public boolean debitar(double valor) {
        return isStatus();
    }

}
