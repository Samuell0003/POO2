package exercicio01;
public class Assistente extends Funcionario{

    public Assistente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculaSalario() {
        // TODO Auto-generated method stub
        return getSalario_base();
    }
    
}
