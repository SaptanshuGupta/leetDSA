class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // if there is not enough flower to make bouquet 
        if ((long) m * k > n ){
            return -1 ;
        }
        
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        // finding the minimum and maximum blooming day 

        for (int day : bloomDay){
            left = Math.min(left,day);
            right = Math.max(right,day);
        }   

        // binary searching :
        while (left <= right){
            int mid = ( left + right )/ 2;
            
            if (canMake(bloomDay , m , k , mid)){
                right =  mid - 1;

            }
            else {
                left =  mid + 1 ;

            }
        }
        return left ;
    }
    private boolean canMake (int[] bloomDay, int m, int k, int day){
        int flower = 0; 
        int bouquet = 0;
        for (int bloom : bloomDay){
            if (bloom <= day ){
                flower ++ ;
                if (flower == k){
                    bouquet++;
                    flower = 0;
                }

            }
            else {
                flower = 0;

            }
            if(bouquet >= m){
                return true ;
            }
        }
        return false ;
    }
}