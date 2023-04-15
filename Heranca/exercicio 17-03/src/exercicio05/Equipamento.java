package exercicio05;

public class Equipamento {
    private boolean ligado;

    
    public Equipamento(boolean ligado) {
        this.ligado = ligado;
    }

    public Equipamento() {}

    public void ligar() {
        ligado = true;
    }

    public void desligado() {
        ligado = false;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

}
