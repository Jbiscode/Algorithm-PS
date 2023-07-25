import java.util.*;
class Solution {
    public static int recursion(int a, int b){
        if(a==b || b==0){
            return 1;
        }
        return recursion(a-1,b-1) + recursion(a-1,b);
    }
    
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = recursion(balls,share);
        
        return answer;
    }
}