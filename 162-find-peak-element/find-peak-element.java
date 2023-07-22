class Solution {
    public int findPeakElement(int[] nums) {
        // for(int i = 1; i<=nums.length; i++){
           
    //         if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
    //             return i;
    //         }
    //     }
    
    //     return 0;
    // }

      int start=0,end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                  start=mid+1;
                
            }else{
                end=mid;
            }

        }
        return start;
    }
}