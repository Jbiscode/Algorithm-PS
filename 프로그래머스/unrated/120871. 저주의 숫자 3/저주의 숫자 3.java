class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean hasThree;

        for (int i = 0; i < n; i++) {
            hasThree = true;
            answer++;

            while (hasThree) {
                String answerStr = String.valueOf(answer);

                if (answer % 3 == 0||answerStr.contains("3")) {
                    answer++;
                } else {
                    hasThree = false;
                }
            }
        }
        return answer;
    }
}