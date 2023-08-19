class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int len = arr.length;
        answer = new int[len];
        int qLen = queries.length;
        
        for(int i=0; i<qLen; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(j%queries[i][2]==0){
                    arr[j] += 1;
                }else{
                    arr[j] += 0;
                } 
            }
        }
        
        for(int i=0;i<len;i++){
            answer[i] = arr[i];
        }
        
        return answer;
    }
}