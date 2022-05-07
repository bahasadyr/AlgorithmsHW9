package HW9;

public class HW9_tas10_peakElem {
    /**
     * Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения пиковых элементов (элементы, которые больше своих соседей).
     * Test Data:
     * {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */
    public static void peakElem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i] && arr[j] > arr[j + 1]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        peakElem(new int[]{3, 2, 7, 5, 1, 9, 23, 1});
    }
}
