class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        if (my_string.contains(alp)) {
            answer = my_string.replace(alp, alp.toUpperCase());
        } else {
            answer = my_string;
        }
        return answer;
    }
}