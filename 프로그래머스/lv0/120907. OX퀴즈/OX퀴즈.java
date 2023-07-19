class Solution {
    public static String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer = new String[len];
        for(int i=0;i<len;i++){
            String[] value = quiz[i].split(" ");

            switch(value[1]){
                case "+":
                    answer[i] = Integer.parseInt(value[0]) + Integer.parseInt(value[2]) == Integer.parseInt(value[4]) ? "O":"X";
                    break;
                case "-":
                    answer[i] = Integer.parseInt(value[0]) - Integer.parseInt(value[2]) == Integer.parseInt(value[4]) ? "O":"X";
                    break;
            }
        }
        return answer;
    }
}