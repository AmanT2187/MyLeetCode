class Solution {
    public static void rev(int nums[],int  i,int j){
        int li =i;
        int ri =j;
        while(li<ri){
            int temp = nums[li];
            nums[li]= nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k= k % n;
        if(k <0){
            k +=n;
        }
        rev(nums, 0, n-k-1);
        rev(nums,n-k, n-1);
        rev(nums,0, n-1);

        
    }
}