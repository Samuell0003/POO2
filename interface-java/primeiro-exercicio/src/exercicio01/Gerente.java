package exercicio01;
public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculaSalario() {
        return getSalario_base()*2;
    }
    
}
