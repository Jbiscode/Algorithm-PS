class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean isPlus = false;
        int ruleNumber=0;
        
        if(common[1]-common[0] == common[2]-common[1]){
            isPlus = true;
            ruleNumber = common[1]-common[0];
        }else{
            ruleNumber = common[1]/common[0];
        }
        
        
        if(isPlus){
            answer = common[common.length - 1] + ruleNumber;
        }else{
            answer = common[common.length - 1] * ruleNumber;
        }
        

        return answer;
    }
}