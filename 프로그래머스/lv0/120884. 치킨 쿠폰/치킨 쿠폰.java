// class Solution {
//     public int solution(int chicken) {
//         int answer = 0;
//         int coupon = chicken;
        
//         while(coupon != 0){
//             int service = coupon / 10;
//             if(service == 0){
//                 break;
//             }
//             answer += service;
//             int restCoupon = coupon % 10;
//             coupon = service + restCoupon;
//         }
//         return answer;
//     }
// }

class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while(chicken >= 10){
            int service = chicken / 10;
            int bonus = chicken % 10;
            
            chicken = service + bonus;
            
            answer += service;
        }
        return answer;
    }
}