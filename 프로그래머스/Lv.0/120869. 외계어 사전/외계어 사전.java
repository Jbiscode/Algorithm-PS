class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int[] isValid = new int[dic.length];
        for (int i = 0; i < spell.length; i++) {
            for (int j = 0; j < dic.length; j++) {
                if (dic[j].contains(spell[i])) {
                    isValid[j]++;
                }
            }
        }
        for (int i = 0; i < isValid.length; i++) {
            if (isValid[i] == spell.length) {
                return 1;
            }
        }
        return answer;
    }
}