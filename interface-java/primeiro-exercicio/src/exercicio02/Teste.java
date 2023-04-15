package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        CartaoWeb niver = new Aniversario("Samuel");
        CartaoWeb namorados = new DiaDosNamorados("Eduardo");
        CartaoWeb natal = new Natal("Eduardo 2");

        List<CartaoWeb> cartoes = new ArrayList<>();
        cartoes.add(niver);
        cartoes.add(namorados);
        cartoes.add(natal);


        for (CartaoWeb cartaoWeb : cartoes) {
            cartaoWeb.showMessage();
        }
    }

}