class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] str = my_string.split("");

        for (int i = 0; i < queries.length; i++) {
            int idx = 0;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                String tmp = str[j];
                str[j] = str[queries[i][1] - idx];
                str[queries[i][1] - idx] = tmp;
                idx++;
                if (idx == (queries[i][1] - queries[i][0] + 1) / 2) {
                    break;
                }
            }
        }
        for (String s :
                str) {
            answer += s;
        }

        return answer;
    }
}