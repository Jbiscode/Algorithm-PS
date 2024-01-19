// class Solution {
//     public int solution(int[] numbers, int k) {
//         int idx = 0;
//         while (k != 1) {
//             k--;
//             idx+=2;
//             if (idx == numbers.length) {
//                 idx = 0;
//             }
//             if (idx == numbers.length - 1) {
//                 idx=1;
//                 k--;
//             }
//         }
        

//         return numbers[idx];
//     }
// }

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        if (numbers.length % 2 == 0) {
            idx = k % (numbers.length / 2);
            if (idx == 0) {
                idx = numbers.length / 2;
            }
            answer = numbers[(idx - 1) * 2];

        } else {
            idx = k % numbers.length;

            if (idx == 0) {
                idx = numbers.length;
            }

            if (idx > numbers.length / 2 + 1) {
                System.out.println(numbers.length/2+1);
                idx -= numbers.length/2 + 1;
                answer = numbers[ 2*idx -1];
            } else {

                answer =numbers[(idx - 1) * 2];
            }
        }

        return answer;
    }
}