import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] polyArr = polynomial.split(" \\+ ");
        String[] xSplit;
        int xNum = 0;
        int kNum = 0;

        for (String s : polyArr) {
            if (s.contains("x")) {
                xSplit = s.split("x");
                if (xSplit.length != 0) {
                    xNum += Integer.parseInt(xSplit[0]);
                } else {
                    xNum++;
                }
            } else {
                kNum += Integer.parseInt(s);
            }
        }
        if (xNum > 0) {
            if (xNum > 1) {
                sb.append(xNum);
            }
            sb.append("x");
            if (kNum > 0) {
                sb.append(" + ");
                sb.append(kNum);
            }
        } else {
            sb.append(kNum);
        }

        answer = sb.toString();
        return answer;
    }
}