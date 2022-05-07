package HW9;

public class HW9_task3_sumArray {
    public boolean lengthArrCheck(int[] arr) {
        return arr.length > 0 ? true : false;
    }

    public int sumArray(int[] arr) {
        if(arr.length == 0){

            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }
}
