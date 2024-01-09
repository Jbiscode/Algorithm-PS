import java.util.*;
class Solution {
    public static int recursion(int n, int r){
        if(n==r || r==0){
            return 1;
        }
        return recursion(n-1,r-1) + recursion(n-1,r);
    }
    
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = recursion(balls,share);
        
        return answer;
    }
}
// 확통 Combination을 간단한 점화식으로 나타낼수있다 nCr = (n-1)C(r-1) + (n-1)Cr