import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            arrList.add(i);
        }

        for (int i = 0; i < query.length; i++) {
            int size = arrList.size();
            if (i % 2 == 0) {
                for (int j = size - 1; j >= query[i] + 1; j--) {
                    arrList.remove(j);
                }
            } else {
                for (int j = query[i] - 1; j >= 0; j--) {
                    arrList.remove(j);
                }
            }
        }

        answer = arrList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}