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