import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr =  s.split(" ");
        String a = arr[0];
        int b = Integer.parseInt(arr[1]);

        for (int i = 0; i <b ; i++) {
            System.out.print(a);
        }
    }
}

// Scanner로 받아오면 간단하지만 BufferedReader는 모두 String으로 받아와서 그뒤에 데이터를 바꿔야함
// 그리고 util인 scanner와 다르게 BufferReader는 IOexcption이 필수로 필요하다.


// Scanner를 사용한 예시

// import java.util.*; 
// public class Solution {
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in); 
//         String str = sc.next();
//         int n = sc.nextInt();
//         for(int i = 0; i < n; i++){ 
//             System.out.print(str);
//         } 
//     }
// }