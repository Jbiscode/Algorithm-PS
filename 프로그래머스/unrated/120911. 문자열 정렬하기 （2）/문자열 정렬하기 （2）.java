import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String lower = my_string.toLowerCase();
        String[] split = lower.split("");
        
        Arrays.sort(split);
        
        for (String s : split) {
            answer.append(s);
        }

        return answer.toString();
    }
}