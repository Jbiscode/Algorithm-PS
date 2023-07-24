import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new TreeSet<>();
        int divide = 2;
        
        while(n != 1){
            if(n%divide == 0){
                set.add(divide);
                n /= divide;
            }else{
                divide++;
            }
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}