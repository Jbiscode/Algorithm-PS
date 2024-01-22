class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)&&my_string.contains(is_prefix)){
            answer=1;
        }

        return answer;
    }
}