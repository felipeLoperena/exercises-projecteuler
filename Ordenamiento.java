import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ordenamiento {

    /*
    Descripción
    Recibirás una lista de numeros separadas por una coma ',' tu deber será imprimir
    esa misma lista pero ordenadas de mayor a menor.    si se ingresa: 5,2,4,1 deberá imprimir: 5,4,2,1

    Entrada
    Una sóla línea que contendrá el listado de números separados por una coma ','

    Salida
    Una sóla línea con la misma línea ordenada
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] numbers = input.split(",");
        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i != nums.length - 1) {
                System.out.print(",");
            }
            System.out.print(nums[i]);
        }

        br.close();
    }
}

