public class App {
    public static void main(String[] args) {
        Produto caneta = new Produto(1, "Caneta", 1.55);
        Produto borracha = new Produto(2, "Borracha", 1.15);
        Produto caderno = new Produto(3, "Caderno", 32.99);
        
        Kit kitEscola = new Kit(4, "Kit Escolar");
        kitEscola.adicionarItem(caneta);
        kitEscola.adicionarItem(borracha);
        kitEscola.adicionarItem(caderno);
        
        Venda venda = new Venda();
        venda.registrarVenda(caneta, 2);
        venda.registrarVenda(kitEscola, 1);
        
        System.out.println(venda.emitirComprovante());
    }
}
