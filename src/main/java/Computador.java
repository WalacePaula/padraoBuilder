public class Computador {

    private String processador;
    private int memoriaRAM;

    private String placaDeVideo;
    private String armazenamento;
    private String fonteDeAlimentacao;
    private String gabinete;

    public Computador() {
        this.processador = "";
        this.memoriaRAM = 0;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getFonteDeAlimentacao() {
        return fonteDeAlimentacao;
    }

    public void setFonteDeAlimentacao(String fonteDeAlimentacao) {
        this.fonteDeAlimentacao = fonteDeAlimentacao;
    }

    public String getGabinete() {
        return gabinete;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
    }
}