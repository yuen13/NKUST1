import java.util.*;

public class Dedup {
    public static void main(String[] args) {
        Map<Character, Integer> checkRepeatMap = new HashMap<>();
        List<String> outputResult = new ArrayList<>();
        int firstNumCount = 0;                                  //firstNumCount計算第一次出現的數字的數量
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        String inputNum = strInput.nextLine();

        for (int i = 0; i < inputNum.length(); i++) {
            char getNum = inputNum.charAt(i);                   //getNum拿取inputNum裡的數值
            if (!checkRepeatMap.containsKey(getNum)) {          //透過checkRepeatMap判斷數值是否重複
                outputResult.add(String.valueOf(getNum));       //如不重複將當前數值加進outputResult
                firstNumCount = firstNumCount + 1;              //並且firstNumCount +1
            } else {
                outputResult.add("_");                          //重複的話將一個底線加至outputResult
            }
            checkRepeatMap.put(getNum, i);                      //將getNum的值放進checkRepeatMap，用於if判斷是否重複
        }
        Collections.sort(outputResult);                         //整理outputResult
        System.out.println("nums = " + outputResult);
        System.out.println("Output：" + firstNumCount);
    }
}

