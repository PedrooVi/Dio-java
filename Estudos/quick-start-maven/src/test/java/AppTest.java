import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
     void validarLancamentos(){
        int[] primeiroLancamento = {10,20,30,45,60};
        int[] segundoLancamento = {10,20,30,45,60};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
     }
}
