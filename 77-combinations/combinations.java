class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subsets = new ArrayList();

        genrateSubsets(1,n, new ArrayList(), subsets, k);
        return subsets;
        
    }
    
    void  genrateSubsets(int start,int n, List<Integer> current,List<List<Integer>> subsets,int k){
        if(current.size()==k){
            subsets.add(new ArrayList(current));
            return;
        }


        for(int i=start;i<=n; i++){
            current.add(i);
             genrateSubsets(i+1,n, current, subsets, k);
            current.remove(current.size()-1);
        }
    }

}