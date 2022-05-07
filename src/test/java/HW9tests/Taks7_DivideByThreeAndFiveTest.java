package HW9tests;

import HW9.HW9_task7_DivideByThreeAndFive;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Taks7_DivideByThreeAndFiveTest {

    HW9_task7_DivideByThreeAndFive HW9_task7;

    @BeforeEach
    public void setUp() {
        HW9_task7 = new HW9_task7_DivideByThreeAndFive();
    }

    @Order(1)
    @Test
    public void testDivideByThreeAndFive(){
        int num = 15;
        String expectedResult  = "Good Number";
        String actualResult = HW9_task7.divideByThreeAndFive(num);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(2)
    @Test
    public void testDivideByThreeAndFiveOnlyThree(){
        int num = 6;
        String expectedResult = "Bad Number";
        String actualResult = HW9_task7.divideByThreeAndFive(num);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(3)
    @Test
    public void testDivideByThreeAndFiveOnlyFive(){
        int num = 10;
        String expectedResult = "Poor Number";
        String actualResult = HW9_task7.divideByThreeAndFive(num);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(3)
    @Test
    public void testDivideByThreeAndFiveDivideNegative(){
        int num = 2;
        String expectedResult = "-1";
        String actualResult = HW9_task7.divideByThreeAndFive(num);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
