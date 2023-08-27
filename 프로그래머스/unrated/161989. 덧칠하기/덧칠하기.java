class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 1;
        int start = section[0];
        int end = section[0] + m - 1;


        for (int a :
                section) {
            
            if (start <= a && a <= end) {
                continue;
            } else {
                start = a;
                end = a + m - 1;
                answer++;
            }
        }
        return answer;
    }
}