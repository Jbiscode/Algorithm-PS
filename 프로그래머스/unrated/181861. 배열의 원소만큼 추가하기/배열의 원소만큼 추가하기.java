import java.util.Arrays;
// class Solution {
//     public int[] solution(int[] arr) {
//         int[] answer = {};
        
//         int size = 0;
//         for(int a : arr){
//             size += a;
//         }
//         answer = new int[size];
        
//         int index = 0;
//         for(int i = 0; i<arr.length;i++){
//             for(int j=0;j<arr[i];j++){
//                 answer[index] = arr[i];
//                 index += 1;
//             }
//         }
//         return answer;
//     }
// }


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int size = 0;
        for (int value : arr) {
            size += value;
        }
        answer = new int[size];
        int idx = 0;
        for (int k : arr) {
            for (int j = 0; j < k; j++) {
                answer[idx++] = k;
            }
        }
        return answer;
    }
}