import org.junit.Assert;
import org.junit.Test;

public class BombermanTest { 

    @Test
    public void testChangeGrid() throws Exception {
        String[] testCase1 = {"...O", ".OO.", "O.O.", "...O"};
        String[] testResult1 = {"O...", "....", "....", ".O.."};
        Assert.assertEquals(testResult1, Bomberman.changeGrid(testCase1));
    }

    @Test
    public void testFinalGrid() throws Exception {
        String[] testCase1 = {"...O", "..O.", "O.O.", "...O"};
        String[] testResult1 = {"OOOO", "OOOO", "OOOO", "OOOO"};
        String[] testCase2 = {".......O.OO..O...OO..........O.........OO..O..O.O..OOO.O.O..O...O..O..O...OOO.....OO........O.O..O..O..O.O.O..OO..O.......OO........O...OO.O....O...O.....OO....O..OO.O...OO.O.OO...OO......OOO.."};
        String[] testResult2 = {"OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"};
        Assert.assertEquals(testResult2, Bomberman.finalGrid(2, testCase2));
    }


} 
