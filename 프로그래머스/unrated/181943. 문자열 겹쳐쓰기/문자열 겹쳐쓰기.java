class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        StringBuilder answer = new StringBuilder();

        int overLen = overwrite_string.length();
        String[] myArr = my_string.split("");
        String[] overArr = overwrite_string.split("");
        int idx = 0;

        for (int i = s; i < s+overLen; i++) {
            myArr[i] = overArr[idx++];
        }

        for (int i = 0; i < myArr.length ; i++) {
            answer.append(myArr[i]);
        }
        return answer.toString();
    }
}

// substring으로 문자열을 잘 잘라서 builder에 붙히면 쉬웠다.

// class Solution {
//     public String solution(String my_string, String overwrite_string, int s) {
//         String answer = "";
//         StringBuilder sb = new StringBuilder(); 
//         sb.append(my_string.substring(0, s)); 
//         sb.append(overwrite_string); 
//         sb.append(my_string.substring(s+overwrite_string.length())); 
//         return sb.toString();
//     } 
// }