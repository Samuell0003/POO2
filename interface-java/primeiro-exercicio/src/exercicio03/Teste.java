package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(3, 4);

        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(retangulo);

        for (FormaGeometrica formaGeometrica : formas) {
            System.out.println(formaGeometrica.calcularPerimetro());
            System.out.println(formaGeometrica.calcularArea());
        }
    }
}
