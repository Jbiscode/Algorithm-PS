class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int Asum=0;
        int Bsum=0;
        if(arr1.length < arr2.length){
            return -1;
        }else if(arr1.length > arr2.length){
            return 1;
        }else{
            for(int i:arr1){
                Asum+=i;
            }
            for(int i:arr2){
                Bsum+=i;
            }
            
            if(Asum>Bsum){
                return 1;
            }else if(Asum<Bsum){
                return -1;
            }else{
                return 0;
            }
        }
    }
}