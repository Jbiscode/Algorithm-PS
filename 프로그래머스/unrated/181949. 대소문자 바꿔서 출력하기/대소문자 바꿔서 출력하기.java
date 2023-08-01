import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();

        for (int i = 0; i < len; i++) {
            char word = a.charAt(i);
            int num = word;
            if (num >=65 && num<=90){
                num = word + 32;
            }else if(num>=97 && num<=122){
                num = word -32;
            }
            char convert = (char)num;

            System.out.print(convert);
        }
    }
}
// 변환을 하고 값을 집어넣었다가 다시 변환했는데 알아서 아스키코드값으로 바뀌나보다.
// 다시 문자열로 바뀔때만 (char)을 추가해서 문자로 바꾸자

// import java.util.*;

// public class Solution {
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in); 
//         String a = sc.next();
//         for(int i = 0; i < a.length(); i++){
//             if(a.charAt(i) >= 65 && a.charAt(i) <= 90){ 
//                 System.out.print((char)(a.charAt(i) + 32));
//             }
//             else{ 
//                 System.out.print((char)(a.charAt(i) - 32));
//             }
//         }
//     } 
// }