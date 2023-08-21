//hashmap으로 값을 담아서 알아서 오름차순 정렬이 되기때문에 순차적으로 값을 비교하고 문자열로 변환
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] strArr = s.split("");
        StringBuilder sb = new StringBuilder();
        
        ArrayList<String> strOrder = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(strArr[i])) {
                hashMap.put(strArr[i], hashMap.get(strArr[i]) + 1);
            } else {
                hashMap.put(strArr[i], 1);
            }
        }

        for (String key :
                hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                strOrder.add(key);
            }
        }
        Collections.sort(strOrder);
        for (String a :
                strOrder) {
            sb.append(a);
        }


        answer = sb.toString();
        return answer;
    }
}