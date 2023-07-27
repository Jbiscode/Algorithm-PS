import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] numStrList = new String[len];
        
        for(int i=0;i<len;i++){
            numStrList[i] = String.valueOf(numbers[i]);
        }
        
        String answer = "";
        Comparator<String> compareNums = (a,b) -> (b+a).compareTo(a+b);
        
        Arrays.sort(numStrList,compareNums);
        
        for(String s:numStrList){
            answer += s;
        }
        if(answer.charAt(0) == '0'){
            return "0";
        }
        
        return answer;
    }
}