public class PilhaTestsssss {
    Pilha pilha = new Pilha();

    public boolean testRetiraOUltimoLivro() {
        Livro livro = new Livro("A fortaleza");
        pilha.push(livro);

        Livro livro1 = new Livro("A busca");
        pilha.push(livro1);

        Livro livro2 = new Livro("A Aventura");
        pilha.push(livro2);

        String resultadoEsperado = "A Aventura";

       return  pilha.pop().getNome().equals(resultadoEsperado);

    }

    public boolean testeNaoAdiconaLivroAlemDoLimite () {
        Pilha pilha = new Pilha();

        Livro livro = new Livro("A fortaleza");
        Livro livro1 = new Livro("O joao");
        Livro livro2 = new Livro("O Pedro");
        Livro livro3 = new Livro("A Bibblia");
        Livro livro4 = new Livro("A historia sem fim");
        Livro livro5 = new Livro("A mém");

        pilha.push(livro);
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);

        String resultadoEsperado = "A historia sem fim";


        return pilha.pop().getNome().equals(resultadoEsperado);
    }

    public boolean testeInitialNameOfBook() {
        Pilha pilha = new Pilha();

        Livro livro = new Livro("A fortaleza");
        Livro livro2 = new Livro("Dom Pedro");

        pilha.push(livro);
        pilha.push(livro2);

        String resultadoEsperado = "A fortaleza";

        return pilha.pop().getNome().equals(resultadoEsperado);
    }



}
