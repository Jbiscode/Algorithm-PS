import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    Deque<Character> stack = new ArrayDeque<>();
    StringBuilder sb = new StringBuilder();

    char[] charArr = input.toCharArray();

    for (char c : charArr) {
      // 문자열이면 바로 출력
      if (Character.isLetter(c)) {
        sb.append(c);
      }else if(c == '('){
        stack.push(c);
      }else if(c == ')'){
        while (!stack.isEmpty() && stack.peek() != '(') {
          sb.append(stack.pop());
        }
        // 괄호제거
        stack.pop();
      }else{
        while (!stack.isEmpty() && stack.peek() != '(' && getPriority(c) <= getPriority(stack.peek())) {
          sb.append(stack.pop());
        }
        stack.push(c);
      }
    }
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    System.out.println(sb.toString());

  }


  // 우선순위 값을 숫자로 반환
  private static int getPriority(char op) {
    if (op == '*' || op == '/') return 2;
    if (op == '+' || op == '-') return 1;
    return 0; // '(' 또는 기타
  }
}
