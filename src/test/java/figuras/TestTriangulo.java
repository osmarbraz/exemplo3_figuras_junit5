package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestTriangulo {

    @Test
    public void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 5;
        Triangulo triangulo = new Triangulo(base, altura);
        double retornoFeito = triangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
