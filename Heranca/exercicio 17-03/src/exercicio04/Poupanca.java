package exercicio04;

public class Poupanca extends Conta{
    private int diaRendimento;

    public Poupanca(double saldo, int diaRendimento) {
        super(saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public Poupanca() {}

    @Override
    public void setSaldo(double saldo) {
        // TODO Auto-generated method stub
        if(saldo > 0) super.setSaldo(saldo);
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        if(getSaldo()-valor >= 0) super.sacar(valor);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
