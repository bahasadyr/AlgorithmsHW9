package HW10;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringToNumbersTest {
    StringManipulation stringManipulation;

    @BeforeEach
    public void setUp() {
        stringManipulation = new StringManipulation();
    }

    @Order(1)
    @Test
    public void testStringToNumber() {

        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = stringManipulation.stringToNumbers15("12345");
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumberNeg() {
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        int[] actualResult = stringManipulation.stringToNumbers15("12345");
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumberNegativ() {
        int[] expectedResult = {};
        int[] actualResult = stringManipulation.stringToNumbers15("");
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}


