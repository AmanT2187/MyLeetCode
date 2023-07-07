class Solution {
     List<String> ls = new ArrayList<>();
    public List<String> letterCombinations(String dig) {
       
         if (dig.length() == 0)
            return ls;
        String [] kp = {"", "", "abc", "def","ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};

        combi(dig, kp,"");

        return ls;
        
    }

    void combi(String dig, String[] kp, String res){
        

        if(dig.length()==0){
            ls.add(res);
            return;
        }
        int currNum = dig.charAt(0) -'0';
        String currChoices = kp[currNum];
        for(int i=0; i < currChoices.length(); i++){
            combi(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }
}