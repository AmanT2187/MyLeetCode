class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;

        int idx1=-1;
        for(int i =nums.length-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                 idx1=i;
            break;
            }
           
        }
        if(idx1==-1){
            reverse(0,nums);
        }
        
        else{
            int idx2=-1;
            for(int i = nums.length-1; i>=0; i--){
                if(nums[i]>nums[idx1]){
                    idx2 =i;
                    break;
                }
            }
           
         swap( nums, idx1, idx2);
            reverse(idx1+1, nums);
        }
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int start,int[] nums){
        int i= start;
        int j= nums.length-1;
        while(i<j){
            swap(nums, i,j);
            i++;
            j--;
        }
    }
}