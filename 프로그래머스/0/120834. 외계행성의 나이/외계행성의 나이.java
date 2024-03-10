class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageStr = "" + age;
        int key = 97;
        String[] arr = ageStr.split("");
        
        for(int i = 0; i<arr.length;i++){
            sb.append((char)(key+Integer.parseInt(arr[i])));
        }

        return sb.toString();
    }
}