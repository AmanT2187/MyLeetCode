class Solution {
    public boolean checkPossibility(int[] arr) {
        	int count =0;
            int n = arr.length;
		
			for(int i=n-1;i>0; i--){
			if(arr[i-1]>arr[i]){
				count++;
			 if ((i - 2 >= 0) && (arr[i-2] > arr[i]) &&
			  (i + 1 < n) && (arr[i-1] > arr[i+1])) {
            count++;
        }
			}
			if(count>1) return false;
		}
		
		return count<=1;
    }
}