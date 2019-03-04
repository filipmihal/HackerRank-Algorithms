import org.junit.Assert;
import org.junit.Test;

/** 
* Toy Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 4, 2019</pre> 
* @version 1.0 
*/ 
public class ToyTest { 


    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(30, Toy.area(new int[][]{{1,1,1}, {1,1,1}, {1,1,1}}));
        Assert.assertEquals(1276, Toy.area((new int[][]{{91, 80, 7, 41, 36, 11, 48, 57, 40, 43}})));
    }



} 
