class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        
//         picture 전체 길이 확인 
        for(int i=0;i<picture.length;i++){
            for(int j=0;j<picture[i].length();j++){     //그 속에 picture[x]의 char 확인
                for(int l=0;l<k;l++){                 // picture[x].char를 k개씩 추가하고 다시 반복 
                    sb.append(picture[i].charAt(j));
                }
            }
            for(int l=0;l<k; l++){          //위에서 추가한 picture[x]를 k개만큼 복사
                answer[idx] = sb.toString();
                idx++;
            }
            sb.setLength(0);
        }
        
        return answer;
    }
}