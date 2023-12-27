class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int startNum = 1;
        int row = 0, col = -1;
        int direction = 1;
        
        while(n > 0){
            for(int i = 0; i < n ;i++){
                col += direction;
                answer[row][col] = startNum++;
            }
            
            n--;
            
            for(int i = 0; i < n; i++){
                row += direction;
                answer[row][col] = startNum++;
            }
            direction *= -1;
        }
        
        return answer;
    }
}