class Solution {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int j : array) {
            if (j > height) {
                answer++;
            }
        }
        return answer;
    }
}