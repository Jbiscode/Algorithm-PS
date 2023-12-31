import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string, " ");
        ArrayList<String> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }
        return arr.toArray(new String[0]);
    }
}