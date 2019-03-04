import java.util.Arrays;

public class Container {
    public static String organize(int[][] container){
        int[] containerSizes = new int[container.length];
        int[] ballCount = new int[container.length];
        for (int col = 0; col < container[0].length; col++) {
            int balls = 0;
            containerSizes[col] = Arrays.stream(container[col]).sum();
            for(int row = 0; row < container.length; row++){
                balls += container[row][col];
            }
            ballCount[col] = balls;
        }
        Arrays.sort(ballCount);
        Arrays.sort(containerSizes);
        for(int a = 0; a<ballCount.length; a++){
            if (ballCount[a] > containerSizes[a])
                return "Impossible";
        }
        return "Possible";
    }
}
