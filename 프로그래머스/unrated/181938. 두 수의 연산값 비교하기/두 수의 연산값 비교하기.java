class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a)+String.valueOf(b);
        if (Integer.parseInt(ab) >= 2 * a * b) {
            answer = Integer.parseInt(ab);
        } else {
            answer = 2 * a * b;
        }
        return answer;
    }
}


// 조금 더 간편한 풀이

// class Solution {
//     public int solution(int a, int b) {
//         int res1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b)); 
//         int res2 = 2 * a * b;
//         return res1 >= res2 ? res1 : res2;
//     } 
// }