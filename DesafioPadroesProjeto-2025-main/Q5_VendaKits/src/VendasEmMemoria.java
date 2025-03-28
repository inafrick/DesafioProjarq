import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada {
    private List<Vendavel> produtos;

    public VendasEmMemoria() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Caneta", 1.55));
        produtos.add(new Produto(2, "Borracha", 1.15));
        produtos.add(new Produto(3, "Caderno", 32.99));

        // Criando um kit de exemplo com 10% de desconto
        Kit kitEscolar = new Kit(4, "Kit Escolar");
        kitEscolar.adicionarItem(produtos.get(0)); // Caneta
        kitEscolar.adicionarItem(produtos.get(1)); // Borracha
        kitEscolar.adicionarItem(produtos.get(2)); // Caderno

        produtos.add(kitEscolar);
    }

    @Override
    public Venda iniciarVenda() {
        return new Venda(LocalDateTime.now());
    }

    @Override
    public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
        Vendavel vendavel = produtos.stream()
            .filter(p -> p.getId() == codigoProduto)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));

        umaVenda.registrarVenda(vendavel, quantidade);
    }

    @Override
    public String emitirComprovante(Venda umaVenda) {
        return umaVenda.emitirComprovante();
    }

    @Override
    public List<Vendavel> buscarProdutos() {
        return Collections.unmodifiableList(produtos);
    }
}
