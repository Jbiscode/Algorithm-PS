import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

// 인덱스를 매번찾는것이 시간복잡도를 증가시킨다.
// 단순히 배열 속 값을 스위칭하는건 시간복잡도가 증가하지 않는다!
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        // 플레이어 이름과 해당 인덱스를 매핑하는 해시 맵 생성
        Map<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            String calling = callings[i];
            int idx = playerIndexMap.get(calling);

            // 호출된 플레이어와 바로 앞순위 플레이어의 위치를 바꿈
            if (idx > 0) {
                String tmp = players[idx - 1];
                players[idx - 1] = players[idx];
                players[idx] = tmp;
                
                // 해시 맵을 업데이트하여 플레이어 위치 정보 갱신
                playerIndexMap.put(tmp, idx);
                playerIndexMap.put(calling, idx - 1);
            }
        }

        // 정렬된 플레이어 명단을 반환
        return players;
    }
}