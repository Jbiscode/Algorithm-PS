import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int startIdx = score.length % m;
        
        Arrays.sort(score);

        for (int i = startIdx; i < score.length; i += m) {
            answer += score[i] * m;
        }
        return answer;
    }
}