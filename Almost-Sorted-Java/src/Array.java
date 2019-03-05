import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static String isSortable(int[] array){
        return "yes";
    }

    public static String isSwappable(int[] array){
        int[] sortedArray = new int[array.length];
        System.arraycopy( array, 0, sortedArray, 0, array.length );
        Arrays.sort(sortedArray);

        int count = 0;
        List<Integer> keys = new ArrayList<Integer>();
        for(int a = 0; a<array.length; a++){
            if(array[a] != sortedArray[a]){
                count++;
                keys.add(a+1);
            }
        }
        if (count == 0){
            return "yes";
        }
        if(count == 2){
            return "yes\nswap " + keys.get(0).toString() + " " + keys.get(1).toString();
        }
        return "no";
    }

    public static void main(String[] args) {
        System.out.print(isSwappable(new int[]{5, 2}));
    }
}
