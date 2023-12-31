class Solution {
    public int trap(int[] arr) {
        int left=0;
        int right= arr.length-1;
        int leftBar = arr[left];
        int rightBar = arr[right];
        int ans =0;

        while(left<=right){
            if(leftBar< rightBar){
                if(arr[left]>leftBar){
                    leftBar = arr[left];
                   
                }else{
                    ans+=leftBar-arr[left];
                    
                }
                left++;
            }else{
                if(arr[right]>rightBar){
                    rightBar = arr[right];
                  
                }else{
                    ans+=rightBar-arr[right];
                }
                right--;
            }
        }

        return ans;
        
    }
}