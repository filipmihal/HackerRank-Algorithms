public class Grid {

    public static int[][] setGrid(String[] rawGrid){
        int[][] grid = new int[rawGrid.length][rawGrid[0].length()];
        for(int a = 0; a<rawGrid.length; a++){
            for (int b = 0; b < rawGrid[a].length(); b++){
                if(rawGrid[a].substring(b, b+1).equals("G")){
                    grid[a][b] = 1;
                }
                else{
                    grid[a][b] = 0;
                }
            }
        }
        return grid;
    }

    public static boolean isPlus(int[][] grid, int size, int x, int y){
        int plusSize = 0;
        for (int z = -size; z <= size; z++){
            plusSize += grid[x+z][y];
            plusSize += grid[x][y+z];
        }
        if(plusSize - 1 == 4*size+1){
            return true;
        }
        else{
            return false;
        }
    }

    public static int findTwoBiggestPluses(String[] grid){
        int[][] newGrid = setGrid(grid);
        int maxSize = (newGrid.length > newGrid[0].length) ? (newGrid[0].length-1)/2 : (newGrid.length-1)/2;
        int first = -1;
        int second = -1;
        for (int s = maxSize; s >= 0; s--){
            for(int x = 0 + s; x < newGrid.length - s; x++){
                for(int y = 0 + s; y < newGrid[x].length - s; y++){
                    if(isPlus(newGrid, s, x, y)){
                        for (int z = -s; z <= s; z++){
                            newGrid[x+z][y] = 0;
                            newGrid[x][y+z] = 0;
                        }
                        if(first != -1){
                            second =  4*s+1;
                        }
                        else{
                            first = 4*s+1;
                        }
                    }
                    if(first != -1 && second != -1){
                        return first * second;
                    }
                    //reset values
                }
            }
        }
        return first * second;
    }
}
