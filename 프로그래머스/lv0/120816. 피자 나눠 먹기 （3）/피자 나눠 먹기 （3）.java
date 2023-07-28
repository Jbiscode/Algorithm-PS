class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int cnt =1;
        int pizza = 1;
        while(true){
            
            if(cnt==slice*pizza){
                pizza++;
                answer++;
            }
            if(cnt==n){
                if(n%slice != 0){
                    answer++;
                }
                break;
            }
            cnt++;
        }
        return answer;
    }
}