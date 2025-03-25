public class ValidadorFactory {

    public static ValidadorInterface criaValidador(Tipo objeto) {
        switch(objeto) {
            case INTEIRO:
                return new ValidadorInteiro();

            case MATRICULA:
                return new ValidadorMatricula();

            case EMAIL:
                return new ValidadorEmail();

            default: return null;
        }
    }
}
