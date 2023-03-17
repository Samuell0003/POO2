package ex07;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;

    public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }


    public double salario() {
        return horasTrabalhadas*valorHora;
    }
    
    public String toString() {
        return "Nome: "+ nome+", salario: "+ salario();
    }
}
