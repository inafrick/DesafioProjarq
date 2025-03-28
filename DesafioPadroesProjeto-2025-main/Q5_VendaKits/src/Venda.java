import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private LocalDateTime data;
    private List<ItemDeVenda> itens;

    public Venda(LocalDateTime data) {
        this.data = data;
        this.itens = new ArrayList<>();
    }

    public List<ItemDeVenda> getItens() {
        return itens;
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getTotal() {
        double total = 0.0;
        for (ItemDeVenda item : itens) {
            total += item.getSubTotal();
        }
        return total;
    }

    public void registrarVenda(Vendavel vendavel, int quantidade) {
        ItemDeVenda item = new ItemDeVenda(vendavel, quantidade);
        itens.add(item);
    }

    public String emitirComprovante() {
        StringBuilder nota = new StringBuilder();
        nota.append("COMPROVANTE DE VENDA\n");
        nota.append(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        nota.append("\n");

        for (ItemDeVenda item : itens) {
            nota.append(item.toString());
        }

        nota.append(String.format("Total: %.2f%n", getTotal()));
        return nota.toString();
    }
}
