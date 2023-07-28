import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int stIdx = commands[i][0] - 1;
            int lasIdx = commands[i][1] - 1;

            int[] arr1 = new int[lasIdx - stIdx + 1];
            int idx = 0;
            for (int j = stIdx; j <= lasIdx; j++) {
                arr1[idx] = array[j];
                idx++;
            }
            Arrays.sort(arr1);

            answer[i] = arr1[commands[i][2]-1];

        }
        return answer;
    }
}

// 처음에 위에처럼 나름 어렵게 구현했는데 
// 다른사람의 풀이처럼 copyOfRange를 사용하면 쉽게 구현가능했다..


// 
// import java.util.Arrays;
// class Solution {
//     public int[] solution(int[] array, int[][] commands) {
//         int[] answer = new int[commands.length];

//         for(int i=0; i<commands.length; i++){
//             int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//             Arrays.sort(temp);
//             answer[i] = temp[commands[i][2]-1];
//         }

//         return answer;
//     }
// }