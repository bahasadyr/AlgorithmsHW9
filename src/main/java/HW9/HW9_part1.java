package HW9;

public class HW9_part1 {
    /*
    *Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
    * и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
Test Data:
-345 →  “Odd”
0 →  “Even”
222222 →  “Even”
2147483647 + 1 →  “Undefined”

     */
    public String retStringOddOrEvenTask1(int num) {
        if (numEvenOrOdd(num)) {
            return "Even";
        } else if (!numEvenOrOdd(num)) {
            return "Odd";
        } else {
            return "Undefined";
        }
    }

    public boolean numEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }


}
