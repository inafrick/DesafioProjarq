import java.util.HashMap;
import java.util.Map;

class CodificacaoSimples implements CodificacaoStrategy {
    private static final Map<Character, Character> tabCod = new HashMap<>();
    private static final Map<Character, Character> tabDeCod = new HashMap<>();

    static {
        tabCod.put('a', '@');
        tabCod.put('e', '#'); 
        tabCod.put('i', '!'); 
        tabCod.put('o', '$'); 
        tabCod.put('u', '%');
        tabDeCod.put('@', 'a'); 
        tabDeCod.put('#', 'e'); 
        tabDeCod.put('!', 'i'); 
        tabDeCod.put('$', 'o');
        tabDeCod.put('%', 'u');
    }

    @Override
    public String codifica(String str) {
        return transformar(str, tabCod);
    }

    @Override
    public String decodifica(String str) {
        return transformar(str, tabDeCod);
    }

    private String transformar(String str, Map<Character, Character> tabela) {
        char[] resp = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            resp[i] = tabela.getOrDefault(str.charAt(i), str.charAt(i));
        }
        return new String(resp);
    }
}
