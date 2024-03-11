import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0;
        int right = 0;
        int sum = sequence[0];

        int len = sequence.length;

        List<SubArray> subArrays = new ArrayList<>();

        while (true) {
          if (sum == k) {
            subArrays.add(new SubArray(left, right));
          }
          if (left == len && right == len) {
            break;
          }
          if (sum <= k && right < len) {
            right++;
            if (right < len) {
              sum += sequence[right];
            }
          } else {
            if (left < len) {
              sum -= sequence[left];
              left++;
            }
          }
        }
        subArrays.sort(SubArray::compareTo);
        
        return new int[] { subArrays.get(0).left, subArrays.get(0).right };
      }

    private class SubArray implements Comparable<SubArray> {
        int left, right, size;

        public SubArray(int left, int right) {
          this.left = left;
          this.right = right;
          this.size = right - left + 1;
        }

        @Override
        public int compareTo(SubArray other) {
          if (this.size == other.size) {
            return this.left - other.left;
          }
          return this.size - other.size;
        }
      }
    
}