class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] split = String.valueOf(num).split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(k + "")) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}