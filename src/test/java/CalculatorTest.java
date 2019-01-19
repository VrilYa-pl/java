import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 3);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testAddition1() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 15);
        Assert.assertEquals(25, result);
    }

    @Test
    public void substractionTest() {
        Calculator calculator = new Calculator();
        int result = calculator.substraction(10, 5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void multiplicationTest() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(2, 5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void divisionTest() {
        Calculator calculator = new Calculator();
        float result = calculator.division(10,3);
        Assert.assertEquals(3.33, result, 1);
        }
    }