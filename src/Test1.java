import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 7, 9, 0, 6};
        System.out.println(Arrays.toString(arr));
        sor(arr);
        System.out.println(Arrays.toString(arr));

        int[][] scores = new int[5][];
        String s = "asd";
        s += " fgh";
        s += 'c';
        s += 2;
        s += false;
        System.out.println(s);
    }
    public static void sor(int[] arr){
        int temp;
        boolean sort = false;
        while(!sort){
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort = false;
                }
            }
        }
    }
}