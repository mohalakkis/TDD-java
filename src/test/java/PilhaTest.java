import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilhaTest {

    @Test
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
}