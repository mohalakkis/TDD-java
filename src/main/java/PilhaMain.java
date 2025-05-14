public class PilhaMain {
    public static void main(String[] args) {

        PilhaTestsssss pilhaTest = new PilhaTestsssss();
        boolean resultado;

        resultado = pilhaTest.testeInitialNameOfBook();
        System.out.println(resultado);

        resultado = pilhaTest.testeNaoAdiconaLivroAlemDoLimite();
        System.out.println(resultado);

        resultado = pilhaTest.testRetiraOUltimoLivro();
        System.out.println(resultado);

    }
}
