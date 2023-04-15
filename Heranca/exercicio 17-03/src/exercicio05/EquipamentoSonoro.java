package exercicio05;

public class EquipamentoSonoro extends Equipamento {
    private int volume;
    private boolean stereo;

    
    public EquipamentoSonoro(boolean ligado, int volume, boolean stereo) {
        super(ligado);
        this.volume = volume;
        this.stereo = stereo;
    }

    public EquipamentoSonoro() {}

    public void mono() {
        stereo = false;
    }

    public void stereo() {
        stereo = true;
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        super.ligar();
        volume = 5;

    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isStereo() {
        return stereo;
    }
}
