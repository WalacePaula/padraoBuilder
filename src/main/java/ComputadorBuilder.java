public class ComputadorBuilder {
    private Computador computador;

    public ComputadorBuilder() {
        computador = new Computador();
    }

    public Computador build() {
        if (computador.getProcessador().equals("")) {
            throw new IllegalArgumentException("Processador é obrigatório");
        }
        if (computador.getMemoriaRAM() <= 0) {
            throw new IllegalArgumentException("Memória RAM inválida (deve ser maior que 0)");
        }
        return computador;
    }

    public ComputadorBuilder setProcessador(String processador) {
        computador.setProcessador(processador);
        return this;
    }

    public ComputadorBuilder setMemoriaRAM(int memoriaRAM) {
        computador.setMemoriaRAM(memoriaRAM);
        return this;
    }

    public ComputadorBuilder setPlacaDeVideo(String placaDeVideo) {
        computador.setPlacaDeVideo(placaDeVideo);
        return this;
    }

    public ComputadorBuilder setArmazenamento(String armazenamento) {
        computador.setArmazenamento(armazenamento);
        return this;
    }

    public ComputadorBuilder setFonteDeAlimentacao(String fonteDeAlimentacao) {
        computador.setFonteDeAlimentacao(fonteDeAlimentacao);
        return this;
    }

    public ComputadorBuilder setGabinete(String gabinete) {
        computador.setGabinete(gabinete);
        return this;
    }
}
