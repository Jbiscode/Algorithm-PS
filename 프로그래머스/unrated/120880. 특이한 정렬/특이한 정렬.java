import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int sub;
        int tmp;

        Arrays.sort(numlist);
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> sortList = new ArrayList<>();

        for (int i = numlist.length-1; i >= 0; i--) {
            arrList.add(numlist[i]);
        }

        System.out.println(arrList);

        // arrList가 빌때까지
        while (!arrList.isEmpty()) {
            sub = Integer.MAX_VALUE;
            // n과의 거리가 가장 작은값 찾기
            for (int i = 0; i < arrList.size(); i++) {
                tmp = Math.abs(arrList.get(i) - n);
                if (tmp <= sub) {
                    sub = tmp;
                }
            }
            // 절댓값이 같으면 큰수부터 sortList에 담기
            for (int i = 0; i < arrList.size(); i++) {
                tmp = Math.abs(arrList.get(i) - n);
                if (tmp == sub) {
                    int a = arrList.remove(i);
                    sortList.add(a);
                    break;
                }
            }

        }

        // sortList를 int배열로
        int[] answer = new int[sortList.size()];
        for (int i = 0; i < sortList.size(); i++) {
            answer[i] = sortList.get(i);
        }

        return answer;
    }
}