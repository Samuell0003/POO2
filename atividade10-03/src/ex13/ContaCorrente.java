package ex13;

public class ContaCorrente {
    private String nome;
    private String senha;
    private double saldo;

    public ContaCorrente(String nome, String senha, double saldo) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void cadastrarSenha(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String oldPassword, String newPassword) {
        if (oldPassword.equals(this.senha)) {
            this.senha = newPassword;
        }
    }

    public void debitar(double valor, String senha) {
        if (senha.equals(this.senha)) {
            this.saldo -= valor;
        }
    }

    public void creditar(double valor, String senha) {
        if (senha.equals(this.senha)) {
            this.saldo += valor;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
