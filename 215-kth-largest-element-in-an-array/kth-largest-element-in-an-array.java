class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=0; i--){
            int j= nums.length-k;
            if(i==j){
                return nums[i];
            }
                
            
        }
        return -1;
    }
}