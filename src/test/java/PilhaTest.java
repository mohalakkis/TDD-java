import calculadora.Calculadora;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {


    @Ignore
    public void testLimitPilha() {
        Pilha pilha = new Pilha();

        Livro livro1 = new Livro("A camponesa");
        Livro livro2 = new Livro("A camponesa");
        Livro livro3 = new Livro("A camponesa");
        Livro livro4 = new Livro("A camponesa");
        Livro livro5 = new Livro("A camponesa");
        Livro livro6 = new Livro("A campones222");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        String resultadoEsperado = "A camponesa";

        pilha.pop().getNome().equals(resultadoEsperado);
        assertEquals(resultadoEsperado, pilha.pop().getNome());

    }

    @Test(expected = ArrayStoreException.class)
    public void testPilhaNaoAddAlemDoLimite() {
        Pilha pilha = new Pilha();
        pilha.push(new Livro("A voltwa"));
        pilha.push(new Livro("A voltwa"));
        pilha.push(new Livro("A voltwa"));
        pilha.push(new Livro("A volt2a"));
        pilha.push(new Livro("A volwta"));
        pilha.push(new Livro("A volwta"));
        pilha.push(new Livro("A volwta"));

    }

    @Test
    public void testeDividerSucess() {
        Calculadora somar = new Calculadora();
        somar.divider(2,34);
    }

    @Test(expected = ArithmeticException.class, timeout = 1000)
    public void testeDividerFail() {
        Calculadora somar = new Calculadora();
        somar.divider(2,0);
    }



    @Test(expected = ArithmeticException.class, timeout = 1000)
    public void testeSomarFail() {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(2,0);
    }

    @Test()
    public void testeSomarSucess() {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(2,2);
    }
}