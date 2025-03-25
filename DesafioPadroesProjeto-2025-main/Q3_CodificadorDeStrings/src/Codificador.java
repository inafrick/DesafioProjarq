class Codificador {
    private CodificacaoStrategy strategy;

    public void setStrategy(CodificacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public String codifica(String str) {
        if (strategy == null) throw new IllegalStateException("Nenhuma estratégia definida");
        return strategy.codifica(str);
    }

    public String decodifica(String str) {
        if (strategy == null) throw new IllegalStateException("Nenhuma estratégia definida");
        return strategy.decodifica(str);
    }
}
