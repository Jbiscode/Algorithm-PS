// 우선 평행이 존재하는지 알아보려면 두점들의 기울기를 비교해서 같은 기울기가 존재하는지 알아봐야한다.
// 기울기 공식은 (y2-y1) / (x2-x1) 이다.
// 2차원 배열 dots에서 (x,y) 두쌍끼리 기울기를 비교하는 함수에 넣어서 비교한뒤 값을 출력한다.

class Solution {
    public double findSlope(int[] x1y1, int[] x2y2){
        return (double)(x2y2[1] - x1y1[1]) / (x2y2[0] - x1y1[0]);    
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        if(findSlope(dots[0], dots[1]) == findSlope(dots[2],dots[3])){
            answer =  1;
        }else if(findSlope(dots[0], dots[2]) == findSlope(dots[1],dots[3])){
            answer =  1;
        }else if(findSlope(dots[0], dots[3]) == findSlope(dots[1],dots[2])){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}