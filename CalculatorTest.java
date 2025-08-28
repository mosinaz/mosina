import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest{
Calculator calc=new Calculator();
@Test public void testAddition(){assertEquals(15,calc.add(10,5));}
@Test public void testSubtraction(){assertEquals(5,calc.subtract(10,5));}
@Test public void testMultiplication(){assertEquals(15,calc.multiply(10,5));}
@Test public void testDivision(){assertEquals(5,calc.divide(10,5));}
}
