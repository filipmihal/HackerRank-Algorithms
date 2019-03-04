import org.junit.Assert;
import org.junit.Test;

/**
* Container Tester.
*
* @author <Authors name>
* @since <pre>Mar 3, 2019</pre>
* @version 1.0
*/
public class ContainerTest {

    @Test
    public void testOrganize() throws Exception {
        int[][] testCase1 = new int[][]{
                {1,3,1},
                {2,1,2},
                {3,3,3}
        };
        int[][] testCase2 = new int[][]{
                {4,3,1},
                {1,1,2},
                {3,3,1}
        };
        Assert.assertEquals("Impossible", Container.organize(testCase1));
        Assert.assertEquals("Possible", Container.organize(testCase2));
    }

} 
