import java.util.Arrays;
import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        String[] split = my_string.split("");
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(split));
        for (String s : set) {
            answer.append(s);
        }
        return answer.toString();
    }
}