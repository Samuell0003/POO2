package exercicio03;

public class Professor extends Funcionario{
    @Override
    public double getSalarioPrimeiraParcela() {
        // TODO Auto-generated method stub
        return super.getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        // TODO Auto-generated method stub
        return 0;
    }

    public Professor(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome, matricula, salario);
    }

    
}
