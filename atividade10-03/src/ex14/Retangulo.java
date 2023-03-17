package ex14;

public class Retangulo {
    private int base, altura;

    public Retangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    public int area() {
        return base*altura;
    }

    public int perimetro() {
        return 2*base+2*altura;
    }

    public boolean quadrado() {
        if (base==altura) {
            return true;
        } else {
            return false;
        }
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
}
