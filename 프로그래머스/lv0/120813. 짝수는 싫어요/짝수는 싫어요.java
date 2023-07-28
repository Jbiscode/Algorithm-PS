import java.util.*;
class Solution {
    public int[] solution(int n) {
        int len = 0;
        if(n%2==0){
            len = n/2;
        }else{
            len = (n+1)/2;
        }
        
        int[] answer = new int[len];
        ArrayList<Integer> tmp = new ArrayList<>();
        
        for(int i=1; i<=n;i+=2){
            tmp.add(i);
        }
        int idx = 0;
        for(Integer num:tmp){
            answer[idx++] = num;
        }
        return answer;
    }
}