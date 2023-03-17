public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Peixe [nome=" + super.getNome() + ", comprimento=" + super.getComprimento() + ", numeroDePatas=" + super.getNumeroDePatas() + ", cor="
                + super.getCor() + ", ambiente=" + super.getAmbiente() + ", velocidadeMedia=" + super.getVelocidadeMedia() + ", Caracteristica="
                + this.caracteristica + "]";
    }
    
}
