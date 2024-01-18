// import java.util.StringTokenizer;

// class Solution {
//     public int solution(String[] babbling) {
//         StringTokenizer st;
//         int answer = 0;
//         String[] canSpeak = new String[]{"aya", "ye", "woo", "ma"};

//         for (int i = 0; i < babbling.length; i++) {
//             for (String s : canSpeak) {
//                 if (babbling[i].contains(s)) {
//                     babbling[i] = babbling[i].replaceFirst(s, " ");
//                     st = new StringTokenizer(babbling[i], " ");
//                     if (!st.hasMoreTokens()) {
//                         answer++;
//                         break;
//                     }
//                 }
//             }
//         }

//         return answer;
//     }
// }

import java.util.StringTokenizer;

class Solution {
    public int solution(String[] babbling) {
        StringTokenizer st;
        int answer = 0;
        String[] canSpeak = new String[]{"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (String s : canSpeak) {
                while (babbling[i].contains(s)) {
                    if (!babbling[i].contains(s + s)) {
                        babbling[i] = babbling[i].replaceFirst(s, " ");
                        
                        st = new StringTokenizer(babbling[i], " ");
                        
                        if (!st.hasMoreTokens()) {
                            answer++;
                            break;
                        }
                        
                    } else {
                        break;
                    }
                }
            }
        }

        return answer;
    }
}