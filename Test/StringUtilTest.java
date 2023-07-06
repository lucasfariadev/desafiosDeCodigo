import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StringUtilTest {
    @Test
    public void testInverterPalavras() {
        String frase = "Hello, World! OpenAI is amazing.";
        String resultadoEsperado = "amazing. is OpenAI World! Hello,";

        String resultado = StringUtil.inverterPalavras(frase);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testRemoverCaracteresDuplicados() {
        String texto = "Hello, World!";
        String resultadoEsperado = "Helo, Wrd!";

        String resultado = StringUtil.removerCaracteresDuplicados(texto);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testEncontrarSubstringPalindromaMaisLonga() {
        String texto = "babad";
        String resultadoEsperado = "bab";

        String resultado = StringUtil.encontrarSubstringPalindromaMaisLonga(texto);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testPrimeiraLetraMaiuscula() {
        String frase = "hello. how are you? i'm fine, thank you.";
        String resultadoEsperado = "Hello. How are you? I'm fine, thank you.";

        String resultado = StringUtil.primeiraLetraMaiuscula(frase);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testIsAnagramaDePalindromo() {
        String texto = "racecar";
        String resultadoEsperado = "true";

        String resultado = StringUtil.isAnagramaDePalindromo(texto);

        assertEquals(resultadoEsperado, resultado);
    }

}

