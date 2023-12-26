import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        // 최대공약수
        int GCD = getGCD(denom1, denom2);
        // 최소공배수
        int LCM = (denom1*denom2)/GCD;
        int firstTopNum = numer1 * (LCM/denom1);
        int secondTopNum = numer2 * (LCM/denom2);

        int topSum = firstTopNum + secondTopNum;

        int GCD2 = getGCD(topSum, LCM);
        int LCM2 = getGCD(topSum,GCD2);
        
        topSum /= LCM2;
        LCM /=LCM2;

        answer[0] = topSum;
        answer[1] = LCM;

        return answer;
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}