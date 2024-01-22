class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long startNum = x;
        for(int i = 0;i<n;i++){
            answer[i] = startNum;
            startNum += x;
        }
        return answer;
    }
}