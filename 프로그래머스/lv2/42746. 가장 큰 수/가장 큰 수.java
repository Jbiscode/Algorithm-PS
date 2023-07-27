import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] numStrList = new String[len];
        
        for(int i=0;i<len;i++){
            numStrList[i] = String.valueOf(numbers[i]);
        }
        
        
        Comparator<String> compareNums = (a,b) -> (b+a).compareTo(a+b);
        
        Arrays.sort(numStrList,compareNums);
        
        //String answer = "";
        StringBuilder answer = new StringBuilder();
        for(String s:numStrList){
            // answer += s;
            answer.append(s);
        }
        if(answer.charAt(0) == '0'){
            return "0";
        }
        
        // return answer;
        return answer.toString();
    }
}
/*
    1. 숫자를 비교할때 앞뒤로 붙혀봐야하기때문에 문자열로 바꿔서 비교하기.
    2. Comparator을 이용해서 비교하고 내림차순으로 정렬
    3. 숫자를 담은 배열을 비교한 형식으로 다시 정렬
    4. 정답을 담을 그릇을 만들고 순서대로 추가
    5. 0만 들어온다면 0000이 출력될 수 도 있는데 0만 출력하도록 추가.
*/