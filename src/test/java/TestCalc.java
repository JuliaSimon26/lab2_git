
import Calc.Advanced_Calculator;
import Calc.Calculator;
import org.junit.Assert;
import org.junit.Test;
public class TestCalc {
    Calculator calculator;

    @Test
    public void addition() throws Exception {
        calculator = new Calculator();
        int actual = calculator.calculate(1,1,1);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void subtraction() throws Exception {
        calculator = new Calculator();
        int actual = calculator.calculate(10,5,2);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void multiplication() throws Exception {
        calculator = new Calculator();
        int actual = calculator.calculate(10,5,3);
        int expected = 50;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void division() throws Exception {
        calculator = new Calculator();
        int actual = calculator.calculate(10,5,4);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
    //деление на ноль
    @Test (expected = ArithmeticException.class)
    public void division_zero() throws Exception {
    calculator = new Calculator();
    int actual = calculator.calculate(1,0,4);
    }
    @Test
    public void Advanced_Calculator_Addition() throws Exception {
        calculator = new Advanced_Calculator();
        int actual = ((Advanced_Calculator) calculator).calculate(1,1, 1,false,false);
        int expected = 2;
        Assert.assertEquals(expected, actual);
   }
    @Test
    public void Advanced_Calculator_buffer() throws Exception {
        calculator = new Advanced_Calculator();
        ((Advanced_Calculator) calculator).calculate(10,3, 3,false,false);
        int actual = ((Advanced_Calculator) calculator).calculate(0,40, 1,true,false);
        int expected = 70;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Advanced_Calculator_buffer_operation() throws Exception {
        calculator = new Advanced_Calculator();
        ((Advanced_Calculator) calculator).calculate(10,3, 3,false,false);
        int actual = ((Advanced_Calculator) calculator).calculate(0,40, 0,true,true);
        int expected = 1200;
        Assert.assertEquals(expected, actual);
    }
    @Test (expected = Exception.class)
    public void no_operation() throws Exception {
        calculator = new Calculator();
        int actual = calculator.calculate(1,1,0);
    }


}
