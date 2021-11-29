public class Input {
    public static String revHash(long hash){
        String result="";
        String newResult="";

        while(hash != 7){
            hash = hash/ 23;
            result = result + letters.charAt((int) (hash % 23));
        }
        for (int i = result.length();i<=0; i--){
            newResult += result.charAt(i);
        }
        return newResult;
    }
