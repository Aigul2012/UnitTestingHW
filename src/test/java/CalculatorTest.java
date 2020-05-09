import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public void initCalculator(){
        calculator = new Calculator();
    }

    @Test
    public void sumTest(){
        long result = calculator.sum(5, 3);
        Assert.assertEquals(result, 8, "Result of sumTestLongLong was not as expected");
    }

    @Test
    public void sumDoubleTest(){
        double result = calculator.sum(5.2,5.5);
        Assert.assertEquals(result, 10.7, "Result of sumDoubleTest was not as expected");
    }

    @Test
    public void subTest(){
        long result = calculator.sub(10, 6);
        Assert.assertEquals(result, 4, "Result of subTest was not as expected");
    }

    @Test
    public void subDoubleTest(){
        double result = calculator.sub(5.6, 3.3);
        Assert.assertEquals(result, 2.3, "Result of subDoubleTest was not as expected");
    }

    @Test
    public void multTest(){
        long result = calculator.mult(5, 2);
        Assert.assertEquals(result, 10, "Result of multTest was not as expected");
    }

    @Test
    public void multDoubleTest(){
        double result = calculator.mult(2.5, 6.6);
        Assert.assertEquals(result, 16, "Result of multDoubleTest is not as expected");
    }

    @Test
    public void divTest(){
        long result = calculator.div(25, 5);
        Assert.assertEquals(result, 5, "Result of divTest is not as expected");
    }

    @Test
    public void divDoubleTest(){
        double result = calculator.div(24.4d, 2.2d);
        Assert.assertEquals(result, 11.59d, "Result of divDoubleTest is not as expected");
    }
    @Test
    public void powTest(){
        double result = calculator.pow(2.5, 2.1);
        Assert.assertEquals(result, 6.25, "Result of PowTest was not as expected");
    }
    @Test
    public void sqrtTest(){
        double result = calculator.sqrt(2.6);
        Assert.assertEquals(result, 3.6, "Result of sqrtTest was not as expected");
    }

    @Test
    public void tgTest(){
        double result = calculator.tg(2.5);
        Assert.assertEquals(result, 45, "Result of tgTest was not as expected");
    }

    @Test
    public void ctgTest(){
        double result = calculator.ctg(2.5);
        Assert.assertEquals(result, 4.5, "Result of ctgTest was not as expected");
    }

    @Test
    public void cosTest(){
        double result = calculator.cos(3.4);
        Assert.assertEquals(result, 9.45, "Result of cosTest was not as expected");
    }

    @Test
    public void sinTest(){
        double result = calculator.sin(3.8);
        Assert.assertEquals(result, 4.9, "Result of sinTest was not as expected");
    }

    @Test
    public void isPositiveTest(){
        boolean result = calculator.isPositive(45);
        Assert.assertEquals(result, true, "Result of booleanTest was not as expected");
    }

    @Test
    public void isNegativeTest(){
        boolean result = calculator.isNegative(-34);
        Assert.assertEquals(result, true, "Result of isNegativeTest was not as expected");
    }
}
