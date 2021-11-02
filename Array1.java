package Arrays;
public class Array1 {
    public static void main(String[] args) {
        System.out.println("Welcome");

        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
    

        int sum = 0;

        int lengthOfArray = arr.length;

        for(int i=0;i<lengthOfArray;i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}