import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {
    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora(5, 3);
        assertEquals(8, calculadora.realizarOperacion("+"), 0);
    }
    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora(5, 3);
        assertEquals(15, calculadora.realizarOperacion("*"), 0);
    }
    @Test
    public void testDivision() {
        Calculadora calculadora = new Calculadora(10, 2);
        assertEquals(5, calculadora.realizarOperacion("/"), 0);
    }
}
