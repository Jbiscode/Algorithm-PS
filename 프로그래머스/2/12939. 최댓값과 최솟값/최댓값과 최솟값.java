class Solution {
    public String solution(String s) {
        String answer = "";
        String[] elements = s.split(" ");
        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[0]);
        for (int i = 1; i < elements.length; i++) {
            int num = Integer.parseInt(elements[i]);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        answer = min + " " + max;

        return answer;
    }
}