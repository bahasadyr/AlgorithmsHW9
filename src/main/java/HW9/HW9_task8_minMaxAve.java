package HW9;

import java.util.Arrays;

public class HW9_task8_minMaxAve {
    /**
     * 8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
     * Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
     * и среднее среди всех значений между 2-мя индексами.
     * <p>
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */
    public static int minInArray(int[] arr) {
        if (arr == null) {
            return 0;
        }
        if (arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxInArray(int[] arr) {
        if (arr == null) {
            return 0;
        }
        if (arr.length == 0) {
            return 0;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int aveInArray(int[] arr) {
        if (arr == null) {
            return 0;
        }
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public int[] minMaxAve(int[]arr, int begin, int end) {
        int[]arrMedium = new int[end - begin + 1];
        for(int i = begin; i < end; i++){
            int count = 0;
            arrMedium[count] = arr[i];
            count++;
        }
        int min = minInArray(arrMedium);
        int max = maxInArray(arrMedium);
        int ave = aveInArray(arrMedium);
        return new int[]{min,max,ave};
    }
}
