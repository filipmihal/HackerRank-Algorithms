import org.junit.Assert;
import org.junit.Test;


public class ArrayTest { 

    @Test
    public void testIsSwappable() throws Exception {
        Assert.assertEquals("yes\nswap 1 2", Array.isSwappable(new int[]{5, 2}));
        Assert.assertEquals("yes\nswap 1 3", Array.isSwappable(new int[]{5, 2, 1}));
        Assert.assertEquals("yes\nswap 1 5", Array.isSwappable(new int[]{5, 2, 3, 4, 1, 6, 7}));
        Assert.assertEquals("yes\nswap 5 6", Array.isSwappable(new int[]{1, 2, 3, 4, 6, 5}));

        Assert.assertEquals("yes", Array.isSwappable(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}));

        Assert.assertEquals("no", Array.isSwappable(new int[]{11, 2, 3, 4, 6, 7, 8, 9, 10}));
        Assert.assertEquals("no", Array.isSwappable(new int[]{1, 2, 3, 4, 7, 11, 8, 9, 6}));
    }


} 
