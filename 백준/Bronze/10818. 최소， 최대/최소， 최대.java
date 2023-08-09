import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();

        String str = sc.nextLine();
        String[] str_arr = str.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int[] answer = new int[2];
        answer[0] = min;
        answer[1] = max;

        System.out.println(min+" "+max);
    }
}
