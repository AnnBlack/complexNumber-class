

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CTest
{        
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber(1);
        ComplexNumber c3 = new ComplexNumber(1,4);
        ComplexNumber c4 = new ComplexNumber(5,1);
    /**
     * Default constructor for test class CTest
     */
    public CTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {

    }
    
    @Test
    public void multiplyComplexByComplex()
    {
        String result = c1.multiply(c2).toString();
        assertEquals("(0.0, 0.0j)",result);
    }
    
    @Test
    public void inverseCompex()
    {
        String result = c3.inverse().toString();
        assertEquals("(4.0, 1.0j)",result);
    }
    
    @Test
    public void inverseAndMultiplyCompex()
    {
        String result = c4.inverse().multiply(c3).toString();
        assertEquals("(-19.0, 9.0j)",result);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
