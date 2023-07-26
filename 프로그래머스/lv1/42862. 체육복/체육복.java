import java.util.*;
class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;    // 처음엔 모든 사람중 안가져온 사람을 뺀 사람만 체육을 수강가능하다.
        Arrays.sort(lost);
        Arrays.sort(reserve);
/*
        모든 값을 비교해서 여분을 가지고있는 사람의 번호와 잃어버린 사람의 번호를 찾는다.
        만약 여분을 가져온 사람이 분실을 한 경우에는 빌려줄 수 없고, 본인은 참여 가능하다. 
        이 학생은 맨처음 answer 에서 참여못하는 인원으로 빼주었기때문에 참여가능한 사람으로 +1 해준다.
        그리고 여분을 가지고 나눠줄 수 있었던 상태에서 나눠줄수 없는 사람으로 변경한다 
*/
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = 0;
                    lost[j] = 0;
                    answer++;
                }
            }
        }
/*      빌려줄 수 있는 사람의 명단과 잃어버린 명단의 사람들의 번호를 비교해서 바로 옆 번호인 사람들을 찾고
        빌려줄 수 있는 사람이 가능하다면 빌려주고 빌려주는사람과 잃어버린 사람의 상태를 더이상 매칭하지 않도록 수정하고
        잃어버린 사람은 빌렸으니 한명의 참여자를 추가한다 +1
        모두 반복한다.
*/
        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] != 0) {
                for (int j = 0; j < lost.length; j++) {
                    if(lost[j] != 0 && reserve[i]-lost[j]==1 || reserve[i]-lost[j]==-1){
                        lost[j] = 0;
                        reserve[i] = 0;
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}

// 주어진 값이 정렬이 안됐을경우도 생각해야한다.
// 예시처럼 정렬된 상태로 주면 좋겠지만 사실상 그렇지 않을수 있기떄문에
// 정렬된 상태로 풀어야한다면 한번 확인삼아 정렬해줘야한다.