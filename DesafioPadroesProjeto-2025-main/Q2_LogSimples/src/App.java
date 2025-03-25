public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log1 = LogSimples.getInstance();
        LogSimples log2 = LogSimples.getInstance();
        log1.log("Mensagem de alerta 1");
        log2.log("Mensagem de alarme 23");
        log1.log("Mensagem de PANICO!!");

        System.out.println("É a mesma instancia? " + (log1==log2));

        for(String m:log1){
            System.out.println(m);
        }
    }
}
