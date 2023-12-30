class Solution {
    public int[] solution(int[] arr) {
        int[] idx = new int[2];
        idx[0] = -1;

        boolean isFirst = true;
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 && isFirst) {
                idx[0] = i;
                isFirst = false;
            } else if (arr[i] == 2) {
                idx[1] = i;
            }
        }
        if (idx[0] == -1) {
            answer = new int[]{-1};
            return answer;
        } else if (idx[1] == 0) {
            answer = new int[]{arr[idx[0]]};
            return answer;
        } else {
            int index = 0;
            answer = new int[idx[1] - idx[0] + 1];
            for (int i = idx[0]; i <= idx[1]; i++) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}