
public class Fibonacci {

    public static void main(String[] args) {
        int limit = 10; // Puedes cambiar este valor para generar más o menos números de Fibonacci.
        fibonacci(1, 1, limit);
    }
    static void fibonacci(int a, int b, int limit) {
        if (limit <= 0) {
            System.out.println("El límite debe ser mayor que 0.");
            return;
        }

        if (limit == 1) {
            System.out.println(a);
            return;
        }
        System.out.print(a + " - ");
        int c = a + b;
        fibonacci(b, c, limit - 1);
    }
}