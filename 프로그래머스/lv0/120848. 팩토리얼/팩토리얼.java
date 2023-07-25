class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int value = 0;
        while(value<=n){
            value = 1;
            for(int i=1;i<=cnt+1;i++){
                value *= i;
            }
            answer = cnt;
            cnt++;
        }
        return answer;
    }
}

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         int cnt = 0;
//         int value = 0;
//         while(value<=n){
//             value = 1;
//             for(int i=1;i<=cnt+1;i++){
//                 value *= i;
//             }
//             if(value < n){
//                 answer = cnt;
//                 cnt++;
//             }else{
//                 answer = cnt;
//             }
//         }
//         return answer;
// }
// }