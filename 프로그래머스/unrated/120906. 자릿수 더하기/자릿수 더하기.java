class Solution {
    public int solution(int n) {
        int answer = 0;
        String numStr = String.valueOf(n);
        String[] split = numStr.split("");
        for (String s : split) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}