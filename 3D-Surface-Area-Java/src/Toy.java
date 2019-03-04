public class Toy {

    public static int area(int[][] bluePrint){
        int x = bluePrint.length;
        int y = bluePrint[0].length;
        int area = 2*y*x;

        for(int j = 0; j<y; j++){
            for (int i = 0; i<x; i++){
                try{
                    area += Math.max(0, bluePrint[i][j] - bluePrint[i-1][j]);
                }catch (IndexOutOfBoundsException e) {
                    area += bluePrint[i][j];
                }
                try{
                    area += Math.max(0, bluePrint[i][j] - bluePrint[i+1][j]);
                }catch (IndexOutOfBoundsException e) {
                    area += bluePrint[i][j];
                }
                try{
                    area += Math.max(0, bluePrint[i][j] - bluePrint[i][j-1]);
                }catch (IndexOutOfBoundsException e) {
                    area += bluePrint[i][j];
                }
                try{
                    area += Math.max(0, bluePrint[i][j] - bluePrint[i][j+1]);
                }catch (IndexOutOfBoundsException e) {
                    area += bluePrint[i][j];
                }
            }
        }
        return area;
    }

    public static void main(String[] args) {
        area(new int[][]{{1,1,1}, {1,1,1}, {1,1,1}});
    }
}
