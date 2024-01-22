class Solution {
    public int solution(int n) {
        int answer;
        int value = (int) Math.sqrt(n);
        
        if (value * value == n) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}