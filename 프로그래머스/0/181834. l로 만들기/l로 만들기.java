class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i =0;i<myString.length();i++){
            int StringChar = (int) myString.charAt(i);
            if(StringChar<=108){
                myString=myString.replace(myString.charAt(i),'l');
            }
        }
        return myString;
    }
}