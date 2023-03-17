package exx15;

public class CodigoPostal {
    private int indicativo;
    private int extensao;
    private String nomeDaZona;

    public CodigoPostal(int indicativo, int extensao, String nomeDaZona) {
        this.indicativo = indicativo;
        this.extensao = extensao;
        this.nomeDaZona = nomeDaZona;
    }

    public String mostrar() {
        return indicativo+"-"+extensao+" "+nomeDaZona;
    }

    public int getExtensao() {
        return extensao;
    }

    public int getIndicativo() {
        return indicativo;
    }

    public String getNomeDaZona() {
        return nomeDaZona;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public void setNomeDaZona(String nomeDaZona) {
        this.nomeDaZona = nomeDaZona;
    }

}
