package exercicio04;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Poupanca poupanca = new Poupanca();

        conta.depositar(10000);
        conta.sacar(15000);

        poupanca.depositar(15000);
        poupanca.sacar(20000);

        System.out.println("Conta: "+conta.getSaldo()+" Poupança: "+ poupanca.getSaldo());
    }
}
