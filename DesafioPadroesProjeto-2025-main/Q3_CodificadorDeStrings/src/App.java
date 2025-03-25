public class App {
    public static void main(String[] args) {
        Codificador codificador = new Codificador();
        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux);
        
        // cod simpl
        codificador.setStrategy(new CodificacaoSimples());
        aux = codificador.codifica(aux);
        System.out.println(aux);
        aux = codificador.decodifica(aux);
        System.out.println(aux);

        // cod desloc
        codificador.setStrategy(new CodificacaoDesloca());
        aux = codificador.codifica(aux);
        System.out.println(aux);
        aux = codificador.decodifica(aux);
        System.out.println(aux);
    }
}
