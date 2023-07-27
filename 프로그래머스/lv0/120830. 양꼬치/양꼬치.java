class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int cost = 12000*n + 2000*k;
        int discount = 0;
        if(n>=10){
            discount = 2000*(n/10);
        }
        answer = cost-discount;
        
        return answer;
    }
}