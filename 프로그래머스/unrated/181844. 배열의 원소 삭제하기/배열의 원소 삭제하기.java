import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int j : arr) {
            set.add(j);
        }

        for (int del : delete_list) {
            set.remove(del);
        }
        
        answer = new int[set.size()];
        int idx = 0;
        
        for (Integer value : set) {
            answer[idx++] = value;
        }

        return answer;
    }
}