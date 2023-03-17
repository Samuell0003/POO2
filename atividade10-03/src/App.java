import java.util.Scanner;
import ex02.*;
import ex07.*;
import ex10.*;
import ex11.*;
import ex12.Calculo;
import ex13.ContaCorrente;
import exx15.CodigoPostal;

public class App {
    public static void main(String[] args) throws Exception {

        
        // Ex: 04
        Scanner entrada = new Scanner(System.in);
        System.out.println(entrada.next().toUpperCase());

        // Ex: 05
        String entrada1 = entrada.next();
        String entrada2 = entrada.next();
        System.out.println((entrada1.equals(entrada2)) ? "Igual" : "Diferente");
        
        // EX: 08
        Circulo circulo1 = new Circulo(32);
        Circulo circulo2 = new Circulo(44);
        Circulo circulo3 = new Circulo(17);
        System.out.println(circulo1.area() +" "+circulo2.area()+" "+circulo3.area());
        System.out.println(circulo1.circunferencia() +" "+circulo2.circunferencia()+" "+circulo3.circunferencia());
        
        // Ex: 09
        Funcionario funcionario2 = new Funcionario("Joao", 20, 3.5);
        Funcionario funcionario1 = new Funcionario("Mateus", 40, 5.5);
        Funcionario funcionario3 = new Funcionario("Lucas", 40 , 13.5);
        System.out.println(funcionario1.toString() +" "+funcionario2.toString()+" "+funcionario3.toString());
        
    
        // Ex: 10
        Pessoa pessoa2 = new Pessoa("Joao", "164413482186", 57);
        Pessoa pessoa3 = new Pessoa("Denizia", "216546516", 44);
        pessoa2.setCpf("3456782378");
        pessoa3.setIdade(43);

        // Ex: 11
        Aluno aluno1 = new Aluno("Ana", 10, 9);
        Aluno aluno2 = new Aluno("Beto", 9, 10);

        aluno1.media();
        aluno2.media();

        // Ex: 12
        Calculo calculo1 = new Calculo(100);
        calculo1.credito(50);
        calculo1.debito(150);
        System.out.println(calculo1.getSaldo());

        // Ex: 13
        ContaCorrente conta1 = new ContaCorrente("Samuel", "1234", 1100);
        conta1.creditar(100, "1234");

        // Ex: 15
        CodigoPostal cep = new CodigoPostal(38680, 000, "Arinos");
        System.out.println(cep.mostrar());
        


    }
}
