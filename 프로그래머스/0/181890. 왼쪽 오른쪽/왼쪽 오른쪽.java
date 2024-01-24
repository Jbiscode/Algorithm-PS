import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        boolean isChecked = false;
        for(int i = 0 ;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                isChecked = true;
                if (i==0) {
                    answer = new String[0];
                }else {
                    answer = new String[i];
                    for (int j = 0; j < i; j++) {
                        answer[j] = str_list[j];
                    }
                }
                break;
            }else if(str_list[i].equals("r")){
                isChecked = true;
                if (i == str_list.length - 1) {
                    answer = new String[0];
                } else {
                    answer = new String[str_list.length - i - 1];
                    for (int j = 0; j < answer.length; j++) {
                        answer[j] = str_list[i + j + 1];
                    }
                }
                break;
            }
        }
        if (!isChecked) {
            answer = new String[0];
        }
        return answer;
    }
}