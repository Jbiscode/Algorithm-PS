class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        char[] codeArr = code.toCharArray();
        int codeLength = codeArr.length;
        System.out.println(codeArr);
        boolean mode = false;

        for (int i = 0; i < codeLength; i++) {
            if (!mode) {
                if (codeArr[i] != '1') {
                    if (i % 2 == 0) {
                        answer.append(codeArr[i]);

                    }
                } else {
                    if (codeArr[i] == '1') {
                        mode = true;
                    }
                }
            } else {
                if (codeArr[i] != '1') {
                    if (i % 2 == 1) {
                        answer.append(codeArr[i]);
                    }
                } else {
                    if (codeArr[i] == '1') {
                        mode = false;
                    }
                }
            }
        }
        if (answer.toString().isEmpty()) {
            return "EMPTY";
        }
        return answer.toString();
    }
}