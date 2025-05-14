package calculadora;

public class Calculadora {

    public int divider(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("tem coisa errada");
        }
        return a / b;
    }

}
