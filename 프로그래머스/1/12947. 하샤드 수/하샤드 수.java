class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int save = x;
        int sum = 0;
        int mod = 10000;
        for(int i = 0; i<= 4; i++){
            sum += save / mod;
            save -= (save/mod) * mod;
            mod /= 10;
        }
        if(x % sum == 0){
            answer=true;
        }
    
        
        return answer;
    }
}