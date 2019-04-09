import org.junit.Assert;
import org.junit.Test;

public class GridTest {

    @Test
    public void testSetGrid() throws Exception {
    }

    /**
    *
    * Method: findTwoBiggestPluses(String[] grid)
    *
    */
    @Test
    public void testFindTwoBiggestPluses() throws Exception {
        String[] testCase = new String[]{"GGGGGG",
                "GBBBGB",
                "GGGGGG",
                "GGBBGB",
                "GGGGGG"};
        String[] testCase2 = new String[]{"GGGGGGGG",
                "GBGBGGBG",
                "GBGBGGBG",
                "GGGGGGGG",
                "GBGBGGBG",
                "GGGGGGGG",
                "GBGBGGBG",
                "GGGGGGGG"};
        Assert.assertEquals(5, Grid.findTwoBiggestPluses(testCase));
        Assert.assertEquals(81, Grid.findTwoBiggestPluses(testCase2));
    }


} 
