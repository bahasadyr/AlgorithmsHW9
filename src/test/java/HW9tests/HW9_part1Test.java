package HW9tests;

import HW9.HW9_part1;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class HW9_part1Test {
    HW9_part1 hw9;

    @BeforeEach
    public void setUp() {
        hw9 = new HW9_part1();
    }

    @Order(1)
    @Test
    public void testOddOrEvenPositive() {
        int number = 32;
        String actualResult = hw9.retStringOddOrEvenTask1(number);
        String expectedResult = "Even";

        Assertions.assertEquals(expectedResult, actualResult, "actual res not equal to expected");

    }

    @Order(2)
    @Test
    public void testOddOrEvenPositiveScenar() {
        int number = 33;
        String actualResult = hw9.retStringOddOrEvenTask1(number);
        String expectedResult = "Odd";

        Assertions.assertEquals(expectedResult, actualResult, "actual res not equal to expected");

    }
//    @Order(3)
//    @Test
//    public void testOddOrEvenPositiveUndef() {
//        int number = 2147483647 + 1;
//        String actualResult =  hw9.retStringOddOrEvenTask1(number);
//        String expectedResult = "Undefined";
//
//        Assertions.assertEquals(expectedResult,actualResult,"actual res not equal to expected");
//
//    }
}
