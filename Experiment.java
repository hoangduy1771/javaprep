import java.util.ArrayList;
import java.util.Collections;

public class Experiment {

    public static void main(String[] args) {
        int[] array = { 2, 2, 3, 5, 5, 0, 3, 2, 5, 7, 7 };

        for (int num : array) {
            System.out.println(num);
        }

        int[] array1 = { -6, 0, 1011, 1053, -1053, 6, 8, 2010, -99, -2010 };
        ArrayList<Integer> arrayListOfDivides3 = new ArrayList<Integer>();
        for (int num : array1) {
            if (num % 3 == 0) {
                arrayListOfDivides3.add(num);
            }
        }
        System.out.println(arrayListOfDivides3);
        int max = Collections.max(arrayListOfDivides3);
        System.out.println(max);
    }

}
