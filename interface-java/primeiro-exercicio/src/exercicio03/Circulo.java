package exercicio03;

public class Circulo implements FormaGeometrica {
    private double raio;

    

    public Circulo(double raio) {
        this.raio = raio;
    }

    

    @Override
    public double calcularPerimetro() {
        return (3.14*raio)*2;
    }

    @Override
    public double calcularArea() {
        return Math.pow(3.14*raio, 2);
    }



    public double getRaio() {
        return raio;
    }



    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
