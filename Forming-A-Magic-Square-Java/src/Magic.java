import java.util.List;

public class Magic {
    public static int square(int[][] square){
        int result = 45;
        int db[][] =
                {
                        {4,9,2,3,5,7,8,1,6},
                        {4,3,8,9,5,1,2,7,6},
                        {2,9,4,7,5,3,6,1,8},
                        {2,7,6,9,5,1,4,3,8},
                        {8,1,6,3,5,7,4,9,2},
                        {8,3,4,1,5,9,6,7,2},
                        {6,7,2,1,5,9,8,3,4},
                        {6,1,8,7,5,3,2,9,4},
                };
        for(int i = 0; i<db.length; i++){
            int total = 0;
            for(int k = 0; k<9; k++){
                total += Math.abs(square[k/3][k%3] - db[i][k]);
            }
            if(total < result){
                result = total;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] testCase1 = new int[][]{
                {4,9,2},
                {3,5,7},
                {8,1,5}
        };
        System.out.println(square(testCase1));
    }
}
