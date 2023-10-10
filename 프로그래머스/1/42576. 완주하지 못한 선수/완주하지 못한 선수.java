import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> parti = new HashMap<>();
        HashMap<String,Integer> compl = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (parti.containsKey(participant[i])) {
                parti.put(participant[i], parti.get(participant[i]) + 1);
            } else {
                parti.put(participant[i], 1);
            }
        }
        for (int i = 0; i < completion.length; i++) {
            if (compl.containsKey(completion[i])) {
                compl.put(completion[i], compl.get(completion[i]) + 1);
            } else {
                compl.put(completion[i], 1);
            }
        }


        for (Map.Entry<String, Integer> a :
                parti.entrySet()) {
            if (compl.containsKey(a.getKey())) {
                if (!compl.get(a.getKey()).equals(a.getValue())) {
                    answer = a.getKey();
                }
            }else{
                answer = a.getKey();
            }
        }




        return answer;
    }
}