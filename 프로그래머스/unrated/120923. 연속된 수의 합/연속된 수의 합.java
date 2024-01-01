import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middleNum = total / num;
        int startNum;

        if (num % 2 == 0) {
            startNum = middleNum - (num / 2) + 1;
        } else {
            startNum = middleNum - (num / 2);
        }
        
        for (int i = 0; i < num; i++) {
            answer[i] = startNum++;
        }
        
        return answer;
    }
}