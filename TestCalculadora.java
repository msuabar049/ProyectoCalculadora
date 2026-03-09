import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {
    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora(5, 3);
        assertEquals(8, calculadora.realizarOperacion("+"), 0);
    }
    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora(5, 3);
        assertEquals(2, calculadora.realizarOperacion("-"), 0);
    }
}
