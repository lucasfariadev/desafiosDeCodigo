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

            //------ quarto Desafio ------------------------
            String frase4 = "hello. how are you? i'm fine, thank you.";
            String resultado4 = StringUtil.primeiraLetraMaiuscula(frase4);
            System.out.println("desafio 4:");
            System.out.println(resultado4);
            StringUtil.linha();
            //-----------------------------------------------

            //------ quinto Desafio ------------------------
            String frase5 = "racecar";
            String resultado5 = StringUtil.isAnagramaDePalindromo(frase5);
            System.out.println("Desafio 5:");
            System.out.println(resultado5);
            StringUtil.linha();
            //-----------------------------------------------

    }


}