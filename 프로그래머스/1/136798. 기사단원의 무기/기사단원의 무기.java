import java.util.Arrays;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] numCnt = new int[100001];

//        각 숫자의 약수 갯수를 찾아서 배열에 저장
        for (int i = 1; i <= 100000; i++) {
            for (int j = i; j <= 100000; j += i) {
                numCnt[j]++;
            }
        }

        // 조건에 맞게 계산
        for (int i = 1; i <= number; i++) {
            if (numCnt[i] > limit) {
                answer += power;
            } else {
                answer += numCnt[i];
            }
        }

        return answer;
    }
}