import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> deque = new LinkedList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr;

        arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        //queue 에 1~N개 생성
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        for (int i = 0; i < M; i++) {
            int target_idx = deque.indexOf(arr[i]);
            int mid_idx;

            if (deque.size() % 2 == 0) {
                mid_idx = deque.size() / 2 - 1;
            } else {
                mid_idx = deque.size() / 2;
            }

            if (target_idx <= mid_idx) {
                for (int j = 0; j < target_idx; j++) {
                    int tmp = deque.pollFirst();
                    deque.offerLast(tmp);
                    count++;
                }
            } else {
                for (int j = 0; j < deque.size() - target_idx; j++) {
                    int tmp = deque.pollLast();
                    deque.offerFirst(tmp);
                    count++;
                }
            }
            deque.poll();
        }
        System.out.println(count);
    }
}