import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
//        cycleSwap(array);
//        cycleSwap(array, 2);
//        cycleSwap1(array);
//        cycleSwap1(array, 2);
        cycleSwap1(array);
        System.out.println(Arrays.toString(array));
    }

    static void cycleSwap1(int[] array) {
        if (array == null) {
            throw new NullPointerException("array and shift must not be null");
        }
        int i1 = array.length - 1;
        int[] tmpArr = new int[array.length];
        int tmp = 0;
        while (tmp < array.length) {
            if (i1 > array.length - 1)
                i1 = 0;
            tmpArr[tmp++] = array[i1++];
        }
        int i = 0;
        for (int k : tmpArr) {
            array[i] = k;
            i++;
        }
    }

    static void cycleSwap1(int[] array, int shift) {
        if (array == null || shift >= 0) {
            throw new NullPointerException("array and shift must not be null");
        }
        int i1 = array.length - shift;
        int[] tmpArr = new int[array.length];
        int tmp = 0;
        while (tmp < array.length) {
            if (i1 > array.length - 1)
                i1 = 0;
            tmpArr[tmp++] = array[i1++];
        }
        int i = 0;
        for (int k : tmpArr) {
            array[i] = k;
            i++;
        }
    }
}
