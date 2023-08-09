import java.util.Scanner;

public class FormulaGeneral {

    /*
    Programa que utiliza la fórmula general

    Entradas
    Tres números enteros A, B y C separados por un espacio, correspondientes a los
    coeficientes de la ecuación cuadrática Ax^2 + Bx + C = 0.

    Salidas
    Dos números reales X1 y X2, soluciones de la ecuación cuadrática, separados por un espacio.
    Para X1 utiliza el signo positivo y para X2 utiliza el signo negativo de la ecuación.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // Calcula el discriminante
        int discriminante = B * B - 4 * A * C;

        // Calcula las soluciones
        double X1 = (-B + Math.sqrt(discriminante)) / (2.0 * A);
        double X2 = (-B - Math.sqrt(discriminante)) / (2.0 * A);

        System.out.printf(X1 + " " + X2);

        scanner.close();
    }
}
