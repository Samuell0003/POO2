public class TestarAnimais {
    public static void main(String[] args) throws Exception {
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2, null);
        Peixe tubarao = new Peixe("Tubarao", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");


        System.out.println(camelo.toString());
        System.out.println(tubarao.toString());
        System.out.println(ursocanada.toString());
    }
}
