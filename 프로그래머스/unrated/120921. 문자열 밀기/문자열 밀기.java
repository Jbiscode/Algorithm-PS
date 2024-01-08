class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < A.length(); i++) {
            if (sb.toString().equals(B)) {
                break;
            }
            sb.insert(0, sb.charAt(A.length() - 1));
            sb.deleteCharAt(A.length());
            answer++;

        }
        if (answer == A.length()) {
            answer = -1;
        }
        return answer;
    }
}