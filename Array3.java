package Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Array3 {
    public static void powerArray(int size, int power) {
        int[] array = new int[size];
        powerArray(4, 2);
        for (int i =0; i < array.length; i++) {
            array[i] = (int) Math.pow(i, power);
        }
        System.out.println(Arrays.toString(array));
        }
    }

