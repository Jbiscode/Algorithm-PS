class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = new int[2];
        int lrMax = board[0] / 2;
        int udMax = board[1] / 2;

        for (String s : keyinput) {
            if (s.equals("left")) {
                if (result[0] > -lrMax) {
                    result[0]--;
                }
            } else if (s.equals("right")) {
                if (result[0] < lrMax) {
                    result[0]++;
                }
            } else if (s.equals("up")) {
                if (result[1] < udMax) {
                    result[1]++;
                }
            } else if (s.equals("down")) {
                if (result[1] > -udMax) {
                    result[1]--;
                }
            }
        }
        return result;
    }
}