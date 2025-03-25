abstract class DadoDecorator implements IDado {
    protected IDado dadoBase;

    public DadoDecorator(IDado dadoBase) {
        this.dadoBase = dadoBase;
    }

    @Override
    public void rolar() {
        dadoBase.rolar();
    }

    @Override
    public int getValor() {
        return dadoBase.getValor();
    }
}