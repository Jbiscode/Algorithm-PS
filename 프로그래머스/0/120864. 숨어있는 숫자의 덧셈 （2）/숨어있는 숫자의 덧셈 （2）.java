class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("0");
        char[] myStr = my_string.toCharArray();

        for (char c : myStr) {
            if (c >= 48 && c <= 58) {
                sb.append(c - 48);
            } else {
                answer += Integer.parseInt(sb.toString());
                sb = new StringBuilder("0");
            }
        }
        answer+=Integer.parseInt(sb.toString());
        return answer;
    }
}