import java.util.HashSet;
import java.util.Set;

public class StringUtil {

    public static void linha(){
        System.out.println("---------------");
    }

    public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            resultado.append(palavras[i]).append(" ");
        }

        return resultado.toString().trim();
    }

    public static String removerCaracteresDuplicados(String texto) {
        StringBuilder resultado = new StringBuilder();
        Set<Character> caracteres = new HashSet<>();

        for (char c : texto.toCharArray()) {
            if (!caracteres.contains(c)) {
                caracteres.add(c);
                resultado.append(c);
            }
        }

        return resultado.toString();
    }

    public static String encontrarSubstringPalindromaMaisLonga(String texto) {
        int tamanhoMax = 0;
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            for (int j = i + 1; j <= texto.length(); j++) {
                String substr = texto.substring(i, j);
                if (isPalindromo(substr) && substr.length() > tamanhoMax) {
                    tamanhoMax = substr.length();
                    resultado = substr;
                }
            }
        }

        return resultado;
    }

    private static boolean isPalindromo(String texto) {
        int i = 0;
        int j = texto.length() - 1;

        while (i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


}
