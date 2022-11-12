import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Calc1Test {

    Calc1 calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Calc1Test.class");
    }

    @BeforeEach
    public void initTest() {
        System.out.println("test started");
        calculator = new Calc1();
    }

    @AfterEach
    public void afterTest() {
        System.out.println("test completed");
        calculator = null;
    }


    @Test
    public void GetSum() {

        int x  = 7, y = 8, expected = 15;

        int result = calculator.getSum( x,y);

        assertEquals(expected, result);
    }

    @Test
    void GetDivide() {

        int x  = 8, y = 4, expected = 2;

        int result = calculator.getDivide( x,y);

        assertEquals(expected, result);


    }

    @Test
    void GetMultiple() {

        int x  = 8, y = 4, expected = 32;

        int result = calculator.getMultiple( x,y);

        assertEquals(expected, result);
    }
}