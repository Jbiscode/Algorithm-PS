class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);

        while (true) {
            int cnt = 0;
            int idx = 0;
            char a = sb.charAt(0);
            
            for (int i = 0; i < sb.length(); i++) {
                idx++;
                
                if (sb.charAt(i) == a) {
                    cnt++;
                } else {
                    cnt--;
                }
                
                if (cnt == 0 || i == sb.length() - 1) {
                    answer++;
                    break;
                }
            }
            
            sb.delete(0, idx);

            if (sb.length() == 0) {
                break;
            }
        }

        return answer;
    }
}