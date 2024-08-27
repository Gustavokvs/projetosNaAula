package exercicios;

public class Conta {

    private String id;
    private String saldo;
    private String tipoDeConta;

    public Conta() {
        this.id = "16";
        this.saldo = "1250";
        this.tipoDeConta = "Corrente";

    }

    public Conta(String id) {
        this.id = id;
    }

    public Conta(String id, String saldoInicial) {
        this.id = id;
        this.saldo = saldoInicial;
    }

    public Conta(String id, String saldoInicial, String tipoDeConta) {
        this.id = id;
        this.saldo = saldoInicial;
        this.tipoDeConta = tipoDeConta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String toString() {
        return "ID: " + this.id + " Saldo: " + this.saldo + " Conta: " + this.tipoDeConta;
    }

}
