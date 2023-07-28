import java.util.*;
class Solution {
    public static int[] solution(int[] answers) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int[] stu1 = {1, 2, 3, 4, 5};          // 학생들이 찍는 루틴 배열화
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];  //학생별 문제 맞춘갯수 나열

        for (int i = 0; i < answers.length; i++) {  //찍는 루틴반복해서 정답지 비교
            if (answers[i] == stu1[i%5]){
                cnt[0] += 1;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == stu2[i%8]){
                cnt[1] += 1;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == stu3[i%10]){
                cnt[2] += 1;
            }
        }

        if (cnt[0] > cnt[1] && cnt[0] > cnt[2]){  //최다 정답자 찾기 조건문
            tmp.add(1);
        } else if (cnt[1] > cnt[0] && cnt[1] > cnt[2]) {
            tmp.add(2);
        } else if (cnt[2] > cnt[0] && cnt[2] > cnt[1]) {
            tmp.add(3);
        } else if (cnt[0] == cnt[1] && cnt[0] > cnt[2]) {
            tmp.add(1);
            tmp.add(2);
        } else if (cnt[0] == cnt[2] && cnt[0] > cnt[1]) {
            tmp.add(1);
            tmp.add(3);
        } else if (cnt[1] > cnt[0]) {
            tmp.add(2);
            tmp.add(3);
        }else {
            tmp.add(1);
            tmp.add(2);
            tmp.add(3);
        }


        int idx = 0;
        int[] answer = new int[tmp.size()];  // ArrayList에 있는 최다정답자 answer[]에 옮기기
        for (Integer a :
                tmp) {
            answer[idx++] = a;
        }

        return answer;
    }
}

// 이 문제는 해설을 안보고 푼 첫 Lv1문제다!!