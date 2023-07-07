class Solution {
    public boolean isSafe(int row, int col, List<String> board, int n){
        int x= row;
        int y =col;

        while(y>=0){
           if (board.get(x).charAt(y) == 'Q') {
                return false;
            }
            y--;
        }

        x= row; 
        y=col;

        while(x>=0 && y>=0){
            if (board.get(x).charAt(y) == 'Q') {
                return false;
            }
            x--;
            y--;

        }

        x=row;
        y=col;

        while(x<n && y>=0){
            if (board.get(x).charAt(y) == 'Q') {
                return false;
            }
            x++;
            y--;
        }

        return true;

    }
    public void solve(int col, List<List<String>> ans, List<String> board, int n){
        if(col==n){
            ans.add(new ArrayList<>(board));
            return;
        }

        for(int row=0; row<n; row++){
            if(isSafe(row, col, board, n)){
              StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());

                solve(col + 1, ans, board, n);

                // Backtrack
                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            board.add(new String(new char[n]).replace('\0', '.'));
        }

        solve(0, ans, board, n);

        return ans;

        
    }
}