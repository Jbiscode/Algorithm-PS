import java.util.StringTokenizer;

class Solution {
    public int solution(String[] babbling) {
        // 말할수 있는 단어들 배열생성
        String[] canSpeak = new String[]{"aya", "ye", "woo", "ma"};
        StringTokenizer st;
        
        int answer = 0;
        // 옹알이 한 내용들 중 발음할 수 있는 내용을 " "로 대체하고 
        // Token을 이용해서 " "로 나눴을때, 모두 발음 가능하면 " "만 남기때문에 토큰이 생성되지 않는다.
        // 토큰이 없다면 옹알이를 모두 발음 가능하다는 뜻이기때문에 +1
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