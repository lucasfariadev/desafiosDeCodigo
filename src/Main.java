public class Main {
    public static void main(String[] args) {

            //------ primeiro Desafio ------------------------
            String frase = "Hello, World! OpenAI is amazing.";
            String resultado = StringUtil.inverterPalavras(frase);
            StringUtil.linha();
            System.out.println("desafio 1: ");
            System.out.println(resultado);
            StringUtil.linha();
            //-----------------------------------------------

            //------ segundo Desafio ------------------------
            String texto = "Hello, World!";
            String resultadoRemocao = StringUtil.removerCaracteresDuplicados(texto);
            System.out.println("desafio 2: ");
            System.out.println(resultadoRemocao);
            StringUtil.linha();
            //-----------------------------------------------

            //------ terceiro Desafio ------------------------
            String textoPalindromo = "babad";
            String resultadoSubstringPalindroma = StringUtil.encontrarSubstringPalindromaMaisLonga(textoPalindromo);
            System.out.println("desafio 3: ");
            System.out.println(resultadoSubstringPalindroma);
            StringUtil.linha();
            //-----------------------------------------------
    }
}