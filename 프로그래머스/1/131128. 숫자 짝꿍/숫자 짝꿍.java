import java.util.ArrayList;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x = new int[10];
        int[] y = new int[10];

        ArrayList<String> str = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            y[Y.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            int min = Math.min(x[i], y[i]);
            for (int j = 0; j < min; j++) {
                str.add(String.valueOf(i));
            }
        }
        
        // 문자열 str을 가장 큰 수가 되도록 정렬
        str.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        //문자열로 합치기
        for (int i = 0; i < str.size(); i++) {
            sb.append(str.get(i));
        }
        
        if (sb.length() == 0) {
            return "-1";
        } else if (sb.charAt(0) == '0') {
            return "0";
        } else {
            answer = sb.toString();
        }
        
        return answer;
    }
}