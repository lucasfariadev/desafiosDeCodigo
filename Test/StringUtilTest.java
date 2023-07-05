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
}

