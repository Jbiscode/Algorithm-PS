import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    arrList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    arrList.remove(arrList.size() - 1);
                }
            }
        }

        int[] answer = new int[arrList.size()];
        
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }

}