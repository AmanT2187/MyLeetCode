class Solution {
    public boolean isHappy(int n) {
        if(n>0){
            Set<Integer> map = new HashSet<>();
            while(n!=1 && !map.contains(n)){
                map.add(n);


                int sum =0;
                while(n!=0){
                    int digit = n%10;
                    sum += digit*digit;
                    n /=10;

                }

                n=sum;
                

            }
        }

        return n==1;
        
    }
}