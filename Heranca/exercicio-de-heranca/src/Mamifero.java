public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public String toString() {
        return "Mamifero [nome=" + super.getNome() + ", comprimento=" + super.getComprimento() + ", numeroDePatas=" + super.getNumeroDePatas() + ", cor="
                + super.getCor() + ", ambiente=" + super.getAmbiente() + ", velocidadeMedia=" + super.getVelocidadeMedia() + ", alimento="
                + this.alimento + "]";
    }

    
}
