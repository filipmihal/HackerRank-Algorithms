import java.util.Arrays;

public class Bomberman {
    public static String[] finalGrid(int n, String[] grid){
        String bomb = "O";
        String blank = ".";
        if(n == 1){
            return grid;
        }
        else if(n%2 == 0){
            for(int i = 0; i < grid.length; i++) {
                grid[i].replace(blank, bomb);
            }
        }
        else if(n%4 == 3){
            grid = changeGrid(grid);
        }
        else if(n%4 == 1){
            grid = changeGrid(grid);
            grid = changeGrid(grid);
        }
        return grid;
    }

    public static String[] changeGrid(String[] grid){
        String[] newGrid = Arrays.copyOf(grid, grid.length);
        for(int a = 0; a < grid.length; a++){
            for(int i = 0; i < grid[a].length(); i++){
                String element = "O";
                if (grid[a].substring(i, i+1).equals("O"))
                    element = ".";
                if(i != grid[a].length()-1)
                    if(grid[a].substring(i+1, i+2).equals("O"))
                        element = ".";
                if(i != 0)
                    if(grid[a].substring(i-1, i).equals("O"))
                        element = ".";
                if(a != 0)
                    if(grid[a-1].substring(i, i+1).equals("O"))
                        element = ".";
                if(a != grid.length-1)
                    if(grid[a+1].substring(i, i+1).equals("O"))
                        element = ".";
                newGrid[a] = newGrid[a].substring(0,i)+element+newGrid[a].substring(i+1);
            }
        }
        return newGrid;
    }
}
