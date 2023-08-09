import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int day;
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            day = 0;
            while (progresses[i] + day * speeds[i] < 100) {
                day++;
            }
            queue.offer(day);
        }
        int tmp = queue.peek();
        while (!queue.isEmpty()) {
            if (queue.peek() <= tmp) {
                queue.poll();
            } else {
                tmp = queue.poll();
            }
            count++;

            if (queue.isEmpty()) {
                arr.add(count);
            } else if (queue.peek() > tmp) {
                arr.add(count);
                count = 0;
                tmp = 0;
            }
        }
        answer = new int[arr.size()];
        // int idx = 0;
        // for (int num :
        //         arr) {
        //     answer[idx++] = num;
        // }
        for(int i = 0; i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}