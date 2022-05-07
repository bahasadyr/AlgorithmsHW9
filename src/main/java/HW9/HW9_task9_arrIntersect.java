package HW9;

import java.util.Arrays;

public class HW9_task9_arrIntersect {
    /**
     * Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */
    public int[] arrIntersection(int[] arr1, int[] arr2) {
        if (arr1.length != 0 || arr1 != null || arr2.length != 0 || arr2 != null) {
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        count++;
                    }
                }
            }
            int[] newArr = new int[count];
            count = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        newArr[count] = arr1[i];
                        count++;
                    }
                }
            }
            return newArr;
        }
        return new int[]{};


    }


}
