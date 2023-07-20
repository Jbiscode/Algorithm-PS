import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[][] idxOfRank = new int[rank.length][2];   //2차원배열생성후 
        for(int i=0; i<rank.length; i++){               //순위와 학생번호(index) 매칭하기
            idxOfRank[i][0] = rank[i];
            idxOfRank[i][1] = i;
        }
        Arrays.sort(idxOfRank, (a,b)->a[0]-b[0]);      //학생 순위로 오름차순정리
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for(int i=0; i<attendance.length;i++){     //성적순서대로 참석가능여부 인덱스 조회하기
            if(attendance[idxOfRank[i][1]]){
                a.add(idxOfRank[i][1]);
            }
            if(a.size()==3){
                break;
            }
        }
        answer = a.get(0)*10000 + a.get(1)*100 + a.get(2);
        return answer;
    }
}