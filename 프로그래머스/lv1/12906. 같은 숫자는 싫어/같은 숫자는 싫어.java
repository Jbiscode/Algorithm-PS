import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int size;
        Stack<Integer> st1 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st1.empty()) {
                st1.push(arr[i]);
            }
            if (st1.peek() != arr[i]) {
                st1.push(arr[i]);
            }
        }
        size = st1.size();
        answer = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            answer[i] = st1.pop();
        }

        return answer;
    }
}