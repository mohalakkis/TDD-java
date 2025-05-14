package calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class CalculadoraTest {
    private int a;
    private int b;

    @Parameterized.Parameters
    public static Collection<Object[]> parametros () {
        return Arrays.asList(new Object[][] {
                {10,20},
                {102,304},
                {12,33}
        });
    }

    public CalculadoraTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(a,b);
        assertEquals(resultado,a+b);
    }



}