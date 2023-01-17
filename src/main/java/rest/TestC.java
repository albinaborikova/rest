package rest;

import org.junit.Assert;
import org.junit.Test;
public class TestC {
    @Test
    public void simpleTestCalculateSum() throws Exception{
        calculator calc = new calculator();
        double res = calc.sum(1, 6);
        Assert.assertEquals(7, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateDoubleSum() throws Exception{
        calculator calc = new calculator();
        double res = calc.sum(13.7, 23.5);
        Assert.assertEquals(37.2, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateDiff() throws Exception{
        calculator calc = new calculator();
        double res = calc.diff(3,2);
        Assert.assertEquals(1, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateNegativeDiff() throws Exception{
        calculator calc = new calculator();
        double res = calc.diff(2,3);
        Assert.assertEquals(-1, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateNegativeDoubleDiff() throws Exception{
        calculator calc = new calculator();
        double res = calc.diff(2.5,3.7);
        Assert.assertEquals(-1.2, res, 0.00001);
    }

    @Test
    public void simpleTestCalculateMult() throws Exception{
        calculator calc = new calculator();
        double res = calc.mult(3, 3);
        Assert.assertEquals(9, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateZeroMult() throws Exception{
        calculator calc = new calculator();
        double res = calc.mult(0, 3);
        Assert.assertEquals(0, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateNegativeMult() throws Exception{
        calculator calc = new calculator();
        double res = calc.mult(-3, 3);
        Assert.assertEquals(-9, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateNegativeDoubleMult() throws Exception{
        calculator calc = new calculator();
        double res = calc.mult(-3.3, 3);
        Assert.assertEquals(-9.9, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateDoubleMult() throws Exception{
        calculator calc = new calculator();
        double res = calc.mult(3.3, 3.33);
        Assert.assertEquals(10.989, res, 0.00001);
    }
    @Test
    public void simpleTestCalculateQuotient() throws Exception{
        calculator calc = new calculator();
        double res = calc.quotient(6, 2);
        Assert.assertEquals(3, res, 0.00001);}

    @Test
    public void simpleTestCalculateDoubleQuotient() throws Exception{
        calculator calc = new calculator();
        double res = calc.quotient(6.2, 2);
        Assert.assertEquals(3.1, res, 0.00001);}

    @Test
    public void simpleTestCalculateNegativeDoubleQuotient() throws Exception{
        calculator calc = new calculator();
        double res = calc.quotient(6.2,- 2);
        Assert.assertEquals(-3.1, res, 0.00001);}

    @Test
    public void simpleTestCalculateDivByZero() throws Exception{
        calculator calc = new calculator();
        double res = calc.quotient(3, 0);
        Assert.assertEquals(Integer.MAX_VALUE, res, 0.00001);}
}
