import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.math.BigInteger;

/** 
* Factorial Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 2, 2019</pre> 
* @version 1.0 
*/ 
public class FactorialTest { 

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: extraLongFactorials(int n)
    *
    */
    @Test
    public void testExtraLongFactorials() throws Exception {
        BigInteger testCase1 = new BigInteger("3628800");
        BigInteger testCase2 = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        Assert.assertEquals(testCase1, Factorial.extraLongFactorials(10));
        Assert.assertEquals(testCase2, Factorial.extraLongFactorials(50));
    }

    /**
    *
    * Method: main(String[] args)
    *
    */
    @Test
    public void testMain() throws Exception {
    //TODO: Test goes here...
    }


} 
