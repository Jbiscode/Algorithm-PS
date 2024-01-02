import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        Arrays.sort(array);
        
        for (int i = array.length - 1; i >= 0; i--) {
            int sub = Math.abs(n - array[i]);
            if (sub <= min) {
                min = sub;
                answer = array[i];
            }
        }
        return answer;
    }
}