import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    public static String primeiraLetraMaiuscula(String texto) {
        String[] frases = texto.split("(?<=\\.\\s|\\?\\s|!\\s)");
        StringBuilder resultado = new StringBuilder();

        for (String frase : frases) {
            if (!frase.trim().isEmpty()) {
                frase = frase.substring(0, 1).toUpperCase() + frase.substring(1);
            }
            resultado.append(frase);
        }

        return resultado.toString();
    }

    public static String isAnagramaDePalindromo(String texto) {
        Map<Character, Integer> frequencia = new HashMap<>();

        for (char c : texto.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        int qtdCaracteresImpares = 0;

        for (int count : frequencia.values()) {
            if (count % 2 != 0) {
                qtdCaracteresImpares++;
            }
        }

        return qtdCaracteresImpares <= 1 ? "true" : "false";
    }



}
