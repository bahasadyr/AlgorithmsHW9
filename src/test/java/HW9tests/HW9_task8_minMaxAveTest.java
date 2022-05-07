package HW9tests;

import HW9.HW9_task8_minMaxAve;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HW9_task8_minMaxAveTest {

    HW9_task8_minMaxAve task8_minMaxAve;

    @BeforeEach
    public void setUp(){
        task8_minMaxAve = new HW9_task8_minMaxAve();
    }

    @Order(1)
    @Test
    public void testMinMaxAve(){
        int[]arr = {1, 2, 3, 4, 5, 6, 7, 8};
        //{1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int indexOne = 2;
        int indexTwo = 6;
        int[]expectedResult = {3,7,5};
        int[]actualResult = task8_minMaxAve.minMaxAve(arr,indexOne,indexTwo);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
