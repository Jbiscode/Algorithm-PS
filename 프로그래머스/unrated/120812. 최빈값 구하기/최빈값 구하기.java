import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int maxCnt = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);
            if (count > max) {
                max = count;
                answer = i;
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == max) {
                maxCnt++;
            }
        }

        if (maxCnt > 1) {
            answer = -1;
        }

        return answer;
    }
}