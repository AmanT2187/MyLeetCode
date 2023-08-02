class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermu(0,nums,ans);
        return ans;
        
    }
    private void recurPermu(int index, int[] nums,List<List<Integer>> ans ){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i =0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i= index; i<nums.length; i++){
            swap(i, index, nums);
            recurPermu(index+1, nums, ans);
            swap(i, index, nums);
        }

    }

    private void swap(int i, int j, int[] nums){
        int t=nums[i];
        nums[i]= nums[j];
        nums[j] =t;
    }
}