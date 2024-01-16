import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        switch (n) {
            case 1:
                for (int i = 0; i <= slicer[1]; i++) {
                    arrayList.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = slicer[0]; i < num_list.length; i++) {
                    arrayList.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    arrayList.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    arrayList.add(num_list[i]);
                }
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}