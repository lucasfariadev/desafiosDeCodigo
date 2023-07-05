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


}
