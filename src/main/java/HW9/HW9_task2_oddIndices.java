package HW9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW9_task2_oddIndices {

    public boolean lengthArrCheck(int[] arr) {
        return arr.length > 0 ? true : false;
    }

//    public boolean arrEvenCheck(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                return true;
//            }
//        }
//        return false;
//    }
    public int[] oddIndices(int[] arr) {
        /*
        * Написать алгоритм OddIndices, который принимает массив чисел,
        *  и возвращает массив значений нечетных индексов
        Test Data:
        Input = {-45, 590, 234, 985, 12, 68}
        Expected Result =  {590, 985, 68}
        */
        if (lengthArrCheck(arr)) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    count++;
                }
            }

            int[] arrResult = new int[count];
            int newcount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arrResult[newcount] = arr[i];
                    newcount++;
                }
            }
            return arrResult;
        }
        return new int[]{};
    }

//    public static void main(String[] args) {
//        HW9_task2_oddIndices obj = new HW9_task2_oddIndices();
//        System.out.println(Arrays.toString(obj.oddIndices(new int[]{-45, 590, 234, 985, 12, 68})));
//    }
}
