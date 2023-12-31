import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        ArrayList<String> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }
        Collections.sort(arr);
        
        return arr.toArray(new String[0]);
    }
}