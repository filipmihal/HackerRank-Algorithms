import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        else if(count == 2){
            return "yes\nswap " + keys.get(0).toString() + " " + keys.get(1).toString();
        }
        else if(count > 2){
            for(int b = 0; b<keys.size() - 1; b++){
                if(keys.get(b)  != keys.get(b+1) - 1){
                    if (count%2 == 0 && b == count/2 - 1)
                        continue;
                    return "no";
                }
                if(array[keys.get(b) - 1] < array[keys.get(b)]){
                    return "no";
                }
            }
            return "yes\nreverse " + keys.get(0).toString() + " " + keys.get(keys.size()-1).toString();
        }

        return "no";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        System.out.print(isSwappable(arr));

        scanner.close();
    }
}
