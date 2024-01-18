import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        
        for (int j : d) {
            sum += j;
            if (sum <= budget) {
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}