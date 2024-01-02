class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] split = cipher.split("");
        for (int i = 0; i < split.length; i++) {
            if ((i + 1) % code == 0) {
                answer.append(split[i]);
            }
        }
        return answer.toString();
    }
}