import org.junit.Assert;
import org.junit.Test;

/** 
* Grid Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 4, 2019</pre> 
* @version 1.0 
*/ 
public class GridTest {

    @Test
    public void testContain() throws Exception {
    String[] testCaseGrid = new String[]{"7283455864",
            "6731158619" ,
            "8988242643" ,
            "3830589324" ,
            "2229505813" ,
            "5633845374" ,
            "6473530293" ,
            "7053106601" ,
            "0834282956" ,
            "4607924137"};
    String[] testCaseSearch = new String[]{
            "9505",
            "3845",
            "3530"};
        Assert.assertEquals("YES", Grid.contain(testCaseGrid, testCaseSearch));
        Assert.assertEquals("YES", Grid.contain(new String[]{"999999","121211"}, new String[]{"99", "11"}));
    }


} 
