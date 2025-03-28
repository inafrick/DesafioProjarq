import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        var cs = new VisualizadorDeSomatorio(dados.getValores());

        Scanner s = new Scanner(System.in);
        int valor = 0;
        boolean media = false, soma = false;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (-1 = ativar somatório, -2 = ativar média, 0 = fim):");
            valor = Integer.parseInt(s.nextLine());

            if (valor == 0) break;
            else if (valor == -1) {
                dados.registraObservador(cs);
                System.out.println("Visualizador de somatório ativado.");
                soma = true;
            } else if (valor == -2) {
                dados.registraObservador(cm);
                System.out.println("Visualizador de média ativado.");
                media = true;
            } else {
                dados.insereValor(valor);
            }

            if(soma) cs.exibeSomatorio();
            if(media) cm.exibeMedia();
        }
        System.out.println("Fim");
    }
}
