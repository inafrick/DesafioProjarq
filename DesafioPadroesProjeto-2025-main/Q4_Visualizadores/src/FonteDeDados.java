import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observador> obs;

    public FonteDeDados(){
        lst = new LinkedList<>();
        obs = new LinkedList<>();
    }

    public void registraObservador(Observador observador) {
        obs.add(observador);
        
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
    }

    public void notificaObservador() {
        for (Observador observador : obs) {
            observador.notifica(this.lst);
        }
    }

    public void insereValor(int valor) {
        this.lst.add(valor);
        this.notificaObservador();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}