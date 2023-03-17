package ex02;

public class Circulo {
    private double pi = 3.1415;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        return pi*(Math.pow(raio, 2));
    }

    public double circunferencia() {
        return 2*pi*raio;
    }
}
