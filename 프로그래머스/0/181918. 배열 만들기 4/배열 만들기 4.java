import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] stk;
        for (int i = 0; i < arr.length; i++) {
            if (arrList.isEmpty()) {
                arrList.add(arr[i]);
            } else {
                Integer tmp = arrList.get(arrList.size() - 1);

                if (arr[i] > tmp) {
                    arrList.add(arr[i]);
                } else {
                    for (int j = arrList.size() - 1; j >= 0; j--) {
                        if (arr[i] <= arrList.get(j)) {
                            arrList.remove(j);
                        } else {
                            break;
                        }
                    }
                    arrList.add(arr[i]);
                }
            }
        }
        stk = arrList.stream().mapToInt(x -> x).toArray();
        return stk;
    }
}