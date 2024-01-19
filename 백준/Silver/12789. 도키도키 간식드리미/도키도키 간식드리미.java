import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");
        int[] arr = new int[inputArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(inputArr[i]);
        }
        
        String answer = "";
        int order = 1;
        boolean[] isValid = new boolean[N+1];
        isValid[0] = true;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != order) {
                if (!stack.isEmpty()){
                    if (stack.peek() == order) {
                        stack.pop();
                        isValid[order] = true;
                        order++;
                        i--;
                    }else {
                        stack.add(arr[i]);
                    }
                }else {
                    stack.add(arr[i]);
                }
            } else if (arr[i] == order) {
                isValid[order] = true;
                order++;
            }
        }
        while (!stack.empty()){
            if (stack.pop() == order) {
                isValid[order] = true;
                order++;
            }
        }

        for (boolean valid : isValid) {
            if (!valid) {
                answer= "Sad";
                break;
            }else{
                answer="Nice";
            }
        }
        System.out.println(answer);
    }
}
