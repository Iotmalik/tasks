import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//        надо было реализовать 2 метода
//        1) static void cycleSwap(int[] array) - двигает массив вправо на 1 ячейку,
//        если это последний элемент, то он переходит вперед: было [1234] стало [4123]
//        2) static void cycleSwap(int[] array, int shift) - аналогичен первому,
//        только вместо 1 это shift: было [1234] shift=2, стало [4312]

public class Array {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
//        cycleSwap(array);
//        cycleSwap(array, 2);
//        cycleSwap1(array);
//        cycleSwap1(array, 2);
        cycleSwap1(array, 2);
        System.out.println(Arrays.toString(array));
    }

    static void cycleSwap(int[] array, int shift) {
        if (array == null || shift >= 0) {
            throw new NullPointerException("array and shift must not be null");
        }
        List<Integer> ints = new ArrayList<>();
        for (int i : array) {
            ints.add(i);
        }
        Collections.rotate(ints, shift);
        for (int i = 0; i < ints.size(); i++) {
            array[i] = ints.get(i);
        }
    }

    static void cycleSwap(int[] array) {
        if (array == null) {
            throw new NullPointerException("array must not be null");
        }
        List<Integer> ints = new ArrayList<>();
        for (int i : array) {
            ints.add(i);
        }
        Collections.rotate(ints, 1);
        for (int i = 0; i < ints.size(); i++) {
            array[i] = ints.get(i);
        }
    }

    static void cycleSwap1(int[] array) {
        if (array == null) {
            throw new NullPointerException("array must not be null");
        }
        int end = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = end;
    }

    static void cycleSwap1(int[] array, int shift) {
        if (array == null || shift >= 0) {
            throw new NullPointerException("array and shift must not be null");
        }
        int rightIndexMove = array.length - shift;
        int[] tmpArr = new int[array.length];
        int tmpIndex = 0;
        while (tmpIndex < array.length) {
            if (rightIndexMove > array.length - 1)
                rightIndexMove = 0;
            tmpArr[tmpIndex++] = array[rightIndexMove++];

        }
        int i = 0;
        for (int k : tmpArr) {
            array[i] = k;
            i++;
        }
    }

    public static double average(int[] array) {
        double av = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i : array) {
                sum += i;
            }
            av = sum / array.length;
        }
        return av;
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

//    static void cycleSwap1(int[] array, int shift) {
//        if (array == null) {
//            throw new NullPointerException("array must not be null");
//        }
//        int[] temp = Arrays.copyOf(array, array.length);
//        int k = 0;
//        for (int i = shift; i < temp.length - 1; i++) {
//            array[k] = temp[i];
//            k++;
//        }
//        for (int j = 0; j < shift - 1; j++) {
//            array[k] = temp[j];
//        }
//    }
}
