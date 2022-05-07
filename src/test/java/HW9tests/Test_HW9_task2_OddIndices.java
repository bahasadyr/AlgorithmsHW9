package HW9tests;

import HW9.HW9_task2_oddIndices;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test_HW9_task2_OddIndices {

    HW9_task2_oddIndices task2Object;

    @BeforeEach
    public void setUp() {
        task2Object = new HW9_task2_oddIndices();

    }

    @Order(1)
    @Test
    public void testOddIndices() {
        int[] expectedArray = new int[]{2, 4};
        int[] actualArray = task2Object.oddIndices(new int[]{1, 2, 3, 4});

        Assertions.assertArrayEquals(expectedArray, actualArray);
    }

    @Order(2)
    @Test
    public void testOddIndicesNegative() {
        int[] expectedArray = new int[]{2, 4, 4567};
        int[] actualArray = task2Object.oddIndices(new int[]{1, 2, 3, 4});

        Assertions.assertNotEquals(expectedArray, actualArray);
    }

    @Order(3)
    @Test
    public void testOddIndicesZEroLengthArr(){

        int[] expectedArray = new int[]{};
        int[] actualArray = task2Object.oddIndices(new int[]{});

        //Assertions.assertEquals(expectedArray, actualArray);
        Assertions.assertArrayEquals(expectedArray, actualArray);

    }
}
