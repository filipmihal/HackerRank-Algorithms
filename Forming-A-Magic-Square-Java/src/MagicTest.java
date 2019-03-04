import org.junit.Assert;
import org.junit.Test;

/** 
* Magic Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 2, 2019</pre> 
* @version 1.0 
*/ 
public class MagicTest {

    /**
    *
    * Method: square(int[][] square)
    *
    */
    @Test
    public void testSquare() throws Exception {
        int[][] testCase1 = new int[][]{
                {4,9,2},
                {3,5,7},
                {8,1,5}
        };
        Assert.assertEquals(1, Magic.square(testCase1));
    }

} 
