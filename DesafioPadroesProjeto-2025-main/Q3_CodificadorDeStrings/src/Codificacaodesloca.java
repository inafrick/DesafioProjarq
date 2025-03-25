class CodificacaoDesloca implements CodificacaoStrategy {
    @Override
    public String codifica(String str) {
        return deslocar(str, 1);
    }

    @Override
    public String decodifica(String str) {
        return deslocar(str, -1);
    }

    private String deslocar(String str, int deslocamento) {
        char[] resp = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            resp[i] = (char) (str.charAt(i) + deslocamento);
        }
        return new String(resp);
    }
}