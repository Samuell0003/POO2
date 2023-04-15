package exercicio02;

public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println(getDestinatario()+" te deseja um feliz dias dos namorados!");
    }
    
}
