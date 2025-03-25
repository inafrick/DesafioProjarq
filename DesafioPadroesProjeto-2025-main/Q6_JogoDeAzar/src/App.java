public class App {
    public static void main(String[] args) {
        IDado d6 = new DadoHistorico(new Dado(6));
        IDado d20 = new DadoHistorico(new Dado(20));

        d6.rolar();
        d20.rolar();

        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());

    }
}
