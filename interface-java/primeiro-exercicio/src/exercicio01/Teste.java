package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Funcionario assistente = new Assistente("Samuel", "dsjad332", 1320);
        Funcionario gerente = new Gerente("Eduardo", "dmsajdk3", 1320);
        Funcionario vendedor = new Vendedor("Joao", "dsnajld2", 1320, 300);

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(assistente);
        funcionarios.add(gerente);
        funcionarios.add(vendedor);


        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.calculaSalario());
        }
    }
}
