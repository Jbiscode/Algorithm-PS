import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min;

        for (int i = 0; i < queries.length; i++) {

            ArrayList<Integer> List = new ArrayList<>();

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2]) {
                    List.add(arr[j]);
                }
            }

            min = 10000000;
            for (int j = 0; j <List.size() ; j++) {
                if (min > List.get(j)) {
                    min = List.get(j);
                }
            }
            if (min != 10000000) {
                answer[i] = min;
            }else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}