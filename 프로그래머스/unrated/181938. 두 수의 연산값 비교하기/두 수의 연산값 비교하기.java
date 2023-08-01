class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a)+String.valueOf(b);
        if (Integer.parseInt(ab) >= 2 * a * b) {
            answer = Integer.parseInt(ab);
        } else {
            answer = 2 * a * b;
        }
        return answer;
    }
}