import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        double actualResult = calculator.add(2, 3);
        double result = 5;
       Assert.assertEquals(result, actualResult, 0);
    }

    @Test
    public void testSubtraction(){
        Calculator calculator = new Calculator();
        double actualResult = calculator.subtract(5, 3);
        double result = 2;
        Assert.assertEquals(result, actualResult, 0);
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();
        double actualResult = calculator.multiply(5, 2);
        double result = 10;
        Assert.assertEquals(result, actualResult, 0);
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        double actualResult = calculator.divide(20, 2);
        double result = 10;
        Assert.assertEquals(result, actualResult, 0);
    }

}
