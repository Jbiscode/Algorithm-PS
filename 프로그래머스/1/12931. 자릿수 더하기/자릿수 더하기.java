import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String numbers = String.valueOf(n);

        String[] numArr = numbers.split("");
        
        for(int i = 0; i<numArr.length;i++){
            answer+=Integer.parseInt(numArr[i]);
        }

        return answer;
    }
}