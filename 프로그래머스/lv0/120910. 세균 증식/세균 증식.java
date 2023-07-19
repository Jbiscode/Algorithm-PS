class Solution {
    public static int solution(int n, int t) {
        int answer = n;
        int idx = 1;
        while(idx <= t){
            answer *= 2;
            idx+=1;
        }
        return answer;
    }
}


// 이진법으로도 풀이가능// n을 <<로 1번 옮길때마다 2배니까 t만큼 옮겨주면된다.
// class Solution {
//     public static int solution(int n, int t) {
//         int answer = 0;

//         answer = n << t;

//         return answer;
//     }
// }