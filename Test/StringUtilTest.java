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
}

