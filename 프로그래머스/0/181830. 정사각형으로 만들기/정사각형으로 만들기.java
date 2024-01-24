class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int arrLenOut = arr.length;
        int arrLenIn = arr[0].length;
        
        if(arrLenOut>arrLenIn){
            answer = new int[arrLenOut][arrLenOut];
        }else{
            answer = new int[arrLenIn][arrLenIn];
        }
        
        for(int i = 0; i < arrLenOut;i++){
            for(int j = 0; j< arrLenIn;j++){
                answer[i][j]=arr[i][j];
            }
        }
        
        return answer;
    }
}