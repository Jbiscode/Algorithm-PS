import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 인덱스를 매번찾는것이 시간복잡도를 증가시킨다.
// 단순히 배열 속 값을 스위칭하는건 시간복잡도가 증가하지 않는다!
class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 플레이어 이름과 해당 인덱스를 매핑하는 해시 맵 생성
        Map<String, Integer> playersMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }
        

        for (int i = 0; i < callings.length; i++) {
            String calling = callings[i];
            int idx = playersMap.get(calling);
            
            // 호출된 플레이어와 앞순서 플레이어 위치바꿈
            String tmp = players[idx];
            players[idx] = players[idx - 1];
            players[idx - 1] = tmp;
            // 해시 맵을 업데이트하여 플레이어 위치 정보 갱신
            playersMap.put(players[idx - 1], idx - 1);
            playersMap.put(players[idx], idx);
        }

// 정렬된 플레이어 명단을 반환
        return players;
    }
}