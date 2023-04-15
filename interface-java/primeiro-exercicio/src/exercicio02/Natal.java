package exercicio02;

public class Natal extends CartaoWeb {

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println(getDestinatario()+" te deseja um feliz Natal!");
    }
    
}
