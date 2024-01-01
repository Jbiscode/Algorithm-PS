import java.util.StringTokenizer;

class Solution {
    public int solution(String[] babbling) {
        String[] canSpeak = new String[]{"aya", "ye", "woo", "ma"};
        StringTokenizer st;
        
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < canSpeak.length; j++) {
                babbling[i] = babbling[i].replace(canSpeak[j], " ");
            }
            
            st = new StringTokenizer(babbling[i]," ");
            
            if (!st.hasMoreTokens()) {
                answer++;
            }
        }
        return answer;
    }
}