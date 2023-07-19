class Solution {
    public static int solution(int n, int t) {
        int answer = n;
        int idx = 1;
        while(idx <= t){
            answer *= 2;
            idx+=1;
        }
        return answer;
    }
}
