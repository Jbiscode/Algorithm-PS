class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int arrLen = arr.length;
        int answerLen = 1;
        
        while(arrLen>answerLen){
            answerLen*=2;
        }
        
        answer = new int[answerLen];
        
        for(int i = 0; i<arrLen;i++){
            answer[i] = arr[i];
        }
        
        return answer;
    }
}