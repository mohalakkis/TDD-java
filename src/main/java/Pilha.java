import java.util.ArrayList;

public class Pilha {
    int limite = 5;

    ArrayList<Livro> pilha = new ArrayList<Livro>();

    public void push(Livro livro){

        if(pilha.size() >= limite || !livro.getNome().startsWith("A") && !livro.getNome().startsWith("O")){
             throw new ArrayStoreException("nao add mais que isso");
        }
        pilha.add(livro);
    }

    public Livro pop(){
        Livro livro = pilha.get(pilha.size()-1);
        pilha.remove(pilha.size()-1);
        return livro;

    }
    public int count(){
        return pilha.size();
    }
}
