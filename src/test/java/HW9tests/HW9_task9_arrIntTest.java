package HW9tests;

import HW9.HW9_task9_arrIntersect;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HW9_task9_arrIntTest {

    HW9_task9_arrIntersect hw9Task9ArrIntersect;

    @BeforeEach
    public void setUp(){
        hw9Task9ArrIntersect = new HW9_task9_arrIntersect();
    }

    @Order(1)
    @Test
    public void testArrIntersectionPositive(){
        //{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        int[]arr1 = {1, 2, 4, 5, 89};
        int[]arr2 = {8, 9, 4, 2};

        int[]expectedResult = {2,4};
        int[]actualResult =  hw9Task9ArrIntersect.arrIntersection(arr1,arr2);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Order(2)
    @Test
    public void testIntersectionArrayNegative(){
        int[]arr1 = {1, 2, 5, 89};
        int[]arr2 = {8, 9};

        int[]expectedResult = {2,4};
        int[]actualResult =  hw9Task9ArrIntersect.arrIntersection(arr1,arr2);

        Assertions.assertNotEquals(expectedResult,actualResult);


    }
    @Order(3)
    @Test
    public void testIntersectionArrayNegativeZeroLength(){
        int[]arr1 = {1, 2, 5, 89};
        int[]arr2 = {};

        int[]expectedResult = {};
        int[]actualResult =  hw9Task9ArrIntersect.arrIntersection(arr1,arr2);

        Assertions.assertNotEquals(expectedResult,actualResult);


    }
    @Order(4)
    @Test
    public void testIntersectionArrayNegativeZeroLeng(){
        int[]arr1 = {1, 2, 4, 5, 89};
        int[]arr2 = {8, 9, 45};

        int[]expectedResult = {};
        int[]actualResult =  hw9Task9ArrIntersect.arrIntersection(arr1,arr2);

        Assertions.assertArrayEquals(expectedResult,actualResult);


    }
    @Order(5)
    @Test
    public void testIntersectionArrayNegativ(){
        int[]arr1 = {1, 2, 4, 5, 8, 9};
        int[]arr2 = {8, 9, -4, -2};

        int[]expectedResult = {8, 9};
        int[]actualResult =  hw9Task9ArrIntersect.arrIntersection(arr1,arr2);

        Assertions.assertArrayEquals(expectedResult,actualResult);


    }
}
