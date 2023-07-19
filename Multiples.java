import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/*
*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
*The sum of these multiples is 23.

*Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Multiples {
    public static void main(String[] args){
        Multiples multiples = new Multiples();
        multiples.run();
    }

    void run(){

        int[] arrayMultiples = {3,5};
        List<Integer> multiplesList = new ArrayList<>();

        int sum = 0;
        int end = 1000;
        for(int count = 1 ; count <= end ; count++) {
            for (int i = 0; i < 2; i++) {
                boolean multiple = isMultiple(count, arrayMultiples[i]);
                if (multiple) {
                    sum += count;
                    multiplesList.add(count);
                }
            }
        }

        Iterator e = multiplesList.iterator();

        while(e.hasNext()){
            System.out.println(e.next());
        }
        System.out.println("The sum of all multiples from 1 to 1000 is: "+ sum);
    }

    public static boolean isMultiple(int number, int multiplesOf) {
        return number % multiplesOf == 0;
    }
}