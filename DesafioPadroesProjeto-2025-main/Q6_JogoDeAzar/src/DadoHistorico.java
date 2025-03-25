import java.util.LinkedList;
import java.util.List;

public class DadoHistorico extends DadoDecorator {
    private List<Integer> historicoJogadas;

    public DadoHistorico(IDado dadoBase){
        super(dadoBase);
        historicoJogadas = new LinkedList<>();
    }

    @Override
    public void rolar(){
        super.rolar();
        historicoJogadas.add(getValor());
    }

    public List<Integer> getHistoricoJogadas(){
        return historicoJogadas;
    }

}
