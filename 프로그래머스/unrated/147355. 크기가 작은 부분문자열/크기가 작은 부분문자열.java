class Solution {
    public long solution(String t, String p) {
        int answer = 0;

        int sLen = t.length();
        int pLen = p.length();

        for (int i = 0; i <= sLen - pLen; i++) {
            if (Long.parseLong(t.substring(i, i + pLen)) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}