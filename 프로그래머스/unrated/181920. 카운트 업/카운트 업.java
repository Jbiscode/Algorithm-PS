class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        int len = end - start + 1 ;
        answer = new int[len];
        
        for(int i=0;i<len;i++){
            answer[i]=start + i;
        }
        
        return answer;
    }
}