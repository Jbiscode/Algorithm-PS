import java.util.Arrays;
import java.util.Iterator;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String[] stringArr = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < stringArr.length; j++) {
                if (j == indices[i]) {
                    stringArr[j] = "";
                }
            }
        }
        for (String s : stringArr) {
            sb.append(s);
        }

        return sb.toString();
    }
}