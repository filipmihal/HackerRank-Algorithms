public class Grid {
    public static String contain(String[] G, String[] P){
        String result = "NO";
        for(int x = 0; x<=G.length-P.length; x++){
            int index = 0;
            while(G[x].indexOf(P[0], index) != -1){
                result = "YES";
                for(int y = 1; y<P.length; y++){
                    String test = G[x+y].substring(G[x].indexOf(P[0], index), G[x].indexOf(P[0],index)+P[0].length());
                    if(!test.equals(P[y])){
                        result = "NO";
                        break;
                    }
                }
                if (result == "YES"){
                    return result;
                }
                index = G[x].indexOf(P[0], index) + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] testCaseGrid = new String[]{"7283455864",
                "6731158619" ,
                "8988242643" ,
                "3830589324" ,
                "2229505813" ,
                "5633845374" ,
                "6473530293" ,
                "7053106601" ,
                "0834282956" ,
                "4607924137"};
        String[] testCaseSearch = new String[]{
                "9505",
                "3845",
                "3530"};
       System.out.println(Grid.contain(testCaseGrid, testCaseSearch));
        System.out.println(Grid.contain(new String[]{"999999","121211"}, new String[]{"99", "11"}));
    }
}
