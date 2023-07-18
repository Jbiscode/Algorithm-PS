import java.util.*;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        HashMap<String,Integer> a =new HashMap<>();
        a.put("iceamericano",4500);
        a.put("americanoice",4500);
        a.put("americano",4500);
        a.put("hotamericano",4500);
        a.put("americanohot",4500);
        a.put("anything",4500);
        
        a.put("cafelatte",5000);
        a.put("icecafelatte",5000);
        a.put("cafelatteice",5000);
        a.put("hotcafelatte",5000);
        a.put("cafelattehot",5000);
        
        answer = Arrays.stream(order).mapToInt(s->a.get(s)).sum();
        return answer;
    }
}