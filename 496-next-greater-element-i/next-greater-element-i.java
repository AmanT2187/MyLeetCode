class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack();

        map.put(nums2[n-1], -1);
        st.push(nums2[n-1]);

        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && st.peek()<nums2[i]){
                st.pop();

            }
            if(st.size()==0){
                map.put(nums2[i], -1);
            } 

            else{
                map.put(nums2[i], st.peek());
            } 
            st.push(nums2[i]);
        }

        for(int i=0; i<=nums1.length-1; i++)
        {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
       
       return res;
    }
}