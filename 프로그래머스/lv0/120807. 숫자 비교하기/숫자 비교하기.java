class Solution1 {
    public int solution1(int num1, int num2) {
        int answer = 0;
        if(num1==num2){
            answer = 1;
        }else{
            answer = -1;
        }
        return answer;
    }
}


class Solution {
    public int solution(int num1, int num2) {
        boolean val = (0 <= num1 && num1 <=10000 && 0 <= num2 && num2 <= 10000);
        int answer = 0;
        if(val){
            answer = (num1 == num2)?1:-1;
        }
        return answer;
    }
}