class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int len = 0;
        if(n%2 == 0){
            len = n / 2;
        }else{
            len = n/2 + 1;
        }
        
        answer = new int[len];
        int idx = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                answer[idx] = i;
                idx++;
            }
        }
        
        return answer;
    }
}