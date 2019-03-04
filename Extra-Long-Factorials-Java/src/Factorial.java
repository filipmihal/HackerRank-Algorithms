import java.math.BigInteger;

public class Factorial {

    public static BigInteger extraLongFactorials(int n){
        BigInteger result = BigInteger.valueOf(1);
        for(int a = 1; a<=n; a++){
            result = result.multiply(BigInteger.valueOf(a));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(extraLongFactorials(5));
    }

}
