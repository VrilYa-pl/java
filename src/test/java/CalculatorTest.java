import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {

        int a =4;
        int b= 3;
        int expected = 7;

        int result = calculator.add(a, b);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAddition1() {
        int result = calculator.add(10, 15);
        Assert.assertEquals(25, result);
    }

    @Test
    public void substractionTest() {
        int result = calculator.substraction(10, 5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void multiplicationTest() {
        int result = calculator.multiplication(2, 5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void divisionTest() {
        int a = 10;
        int b = 5;
        thrown.expect(Calculator.NotEvenNumberException.class);
        int result = calculator.division(a, b);


    }

    @Test(expected = ArithmeticException.class)
    public void testArithmeticException(){
        int a = 4;
        int b = 0;

        int result = calculator.division(a, b);
    }

    @Test
    public void testArithmeticException2() {
        int a = 4;
        int b = 0;
        int result = -1;

        try{
            result = calculator.division(a, b);
        }
        catch (ArithmeticException ex){
            Assert.assertEquals("/ by zero", ex.getMessage());

        }
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testArithmeticException3() {
        int a =4;
        int b=0;
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("/ by zero");

        int result = calculator.division(a,b);

    }

    @Test
    public void testNotNegative() {
        int a = 4;
        int b =-1;
        thrown.expect(Calculator.NegativeNumberException.class);

        int result = calculator.add(a,b);
    }


}