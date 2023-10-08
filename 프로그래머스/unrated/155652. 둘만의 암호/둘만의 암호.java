import java.util.Arrays;

class Solution {
    public String solution(String s, String skip, int index) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String answer = "";
        int idx = 0;
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <skip.length() ; i++) {
            alphabet = alphabet.replace(String.valueOf(skip.charAt(i)), "");
        }

        for (int i = 0; i < s.length(); i++) {
            idx = alphabet.indexOf(s.charAt(i)) + index;
            sb.append(alphabet.charAt(idx % alphabet.length()));
        }

        answer = sb.toString();
        return answer;
    }
}