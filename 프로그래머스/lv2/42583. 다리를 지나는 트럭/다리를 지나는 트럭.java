import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 경과시간
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            queue.add(0);
        }
        //현재 다리가 견디고있는 하중
        int bridgeWeight = 0;
        int truckIdx = 0;
        
        // 모든 트럭이 다리 위로 올라갈때까지
        while (truckIdx < truck_weights.length) {
            bridgeWeight -= queue.poll();
            int nextTruckWeight = truck_weights[truckIdx];

            if (bridgeWeight + nextTruckWeight <= weight) {
                queue.add(nextTruckWeight);
                bridgeWeight += nextTruckWeight;
                truckIdx++;
            } else {
                queue.add(0);
            }
            answer++;
        }

        // 마지막 차가 다리를 나갈때까지 계산
        while (!queue.isEmpty()) {
            queue.poll();
            answer++;
        }


        return answer;
    }
}