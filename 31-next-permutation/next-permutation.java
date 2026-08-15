class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //step 1: find the breakpoint :
        int i = n-2;
        while (i >=0 && nums[i]>=nums[i+1]){
            i--;
        }

        //step 2 : find the next greater elem :
        if (i>=0){
            int j = n-1;
             while (nums[j] <= nums[i]) {
                j--;
             }

             //swap:
             int  temp = nums[i];
             nums[i]= nums[j];
             nums[j] =temp;                        
        }

        //step 3:reverse the part after i:
        int left = i+1;
        int right =n -1 ;
        while(left <right ){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left ++;
            right --;
        }
    }
}