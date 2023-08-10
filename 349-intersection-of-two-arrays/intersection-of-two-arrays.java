class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
			int n= arr1.length;
	int m= arr2.length;
   HashSet<Integer> map = new HashSet<>();
		ArrayList<Integer> ans = new ArrayList<>();

		for(int i=0; i<n; i++){
			map.add(arr1[i]);
		}

		for(int i=0; i<m; i++){
			int ele = arr2[i];
			if(map.contains(ele)){
				ans.add(ele);
				map.remove(ele);
			}
		}

	 int[] arr = new int[ans.size()];
        for (int i= 0; i < ans.size(); i++){
					arr[i] = ans.get(i);
				} 

    return arr;
        
    }
}