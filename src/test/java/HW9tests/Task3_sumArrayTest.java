package HW9tests;

import HW9.HW9_task3_sumArray;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Task3_sumArrayTest {

    HW9_task3_sumArray task3_sumArray;

    @BeforeEach
    public void setUp(){
        task3_sumArray = new HW9_task3_sumArray();
    }

    @Order(1)
    @Test
    public void testSumArrPositive(){
        int[]arr = {1,2,3};
        int expectedResult = 6;
        int actualResult=task3_sumArray.sumArray(arr);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrNegative(){
        int[]arr= {};
        int expectedResult = 0;
        int actualResult = task3_sumArray.sumArray(arr);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrNegativ(){
        int[]arr = {1,2,3};
        int expectedResult = 8;
        int actualResult=task3_sumArray.sumArray(arr);

        Assertions.assertNotEquals(expectedResult,actualResult);
    }
}
