class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int count=1;
        int last=0;
        for(int i=0; i<nums.length-1;i++ ){
            if(nums[i+1]!=nums[i]){

            if(nums[i+1]==nums[i]+1){
                count++;
            }

            else{
                if(last<=count){

                last =count;
                count =1;
                }else{
                    count=1;
                }
            }
            

        }
        }
        
        return Math.max(count, last);
     
        
    }
}