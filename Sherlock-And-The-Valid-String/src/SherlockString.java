import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockString {
    public static String isValid(String s){
        char[] characters =  s.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for( char character : characters){
            if(charMap.containsKey(character))
                charMap.put(character, charMap.get(character) + 1);
            else
                charMap.put(character, 1);
        }
        int maxRemovable = 1;
        Object[] numbers = charMap.values().toArray();
        Arrays.sort(numbers);
        int min = (int) numbers[0];
        int max = (int) numbers[numbers.length-1];

        if(max == min)
            return "YES";
        else if(max == min + 1 && (max > (int) numbers[numbers.length -2] || min < (int) numbers[1])){
            return "YES";
        }
        else if (max == (int) numbers[1] && min < (int) numbers[1])
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd");
    }
}
