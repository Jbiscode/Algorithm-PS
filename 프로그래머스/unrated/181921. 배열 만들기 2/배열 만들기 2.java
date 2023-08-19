import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (!Integer.toString(i).contains("1") && !Integer.toString(i).contains("2") && !Integer.toString(i).contains("3") && !Integer.toString(i).contains("4") && !Integer.toString(i).contains("6") && !Integer.toString(i).contains("7") && !Integer.toString(i).contains("8") && !Integer.toString(i).contains("9")) {
                arrayList.add(i);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(-1);
        }
        answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}