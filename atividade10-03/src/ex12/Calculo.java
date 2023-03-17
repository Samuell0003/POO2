package ex12;

public class Calculo {
    private int saldo = 0;

    public Calculo(int saldo) {
        this.saldo = saldo;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        saldo -= valor;
    }

    public int getSaldo() {
        return saldo;
    }
}