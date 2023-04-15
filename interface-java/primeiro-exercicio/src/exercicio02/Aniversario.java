package exercicio02;

public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println(getDestinatario()+" te deseja um feliz Aniversario!");
    }
    
}
