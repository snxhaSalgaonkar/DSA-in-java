package backtraking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class leetcode54 {
    class Solution {
        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> diag1 = new HashSet<>();
        HashSet<Integer> diag2 = new HashSet<>();

        //List<List<String>> L = new ArrayList<>();

        public void solve(int row, int n,int[] boards, List<int[]> solutions ){
            if (row == n) {
                int[] ans = boards.clone();
                solutions.add(ans);
                return ;
            }
            for (int col = 0; col < n; col++) {
                if (!cols.contains(col) && !diag1.contains(row - col) && !diag2.contains(row + col)) {
                    
                    boards[row] = col;
                    //add data
                    cols.add(col);
                    diag1.add(row - col);
                    diag2.add(row + col);                    
                    //next row
                    solve(row + 1,n,boards, solutions);
                    //no solution so remove that
                    cols.remove(col);
                    diag1.remove(row - col);
                    diag2.remove(row + col);
                                    
                }
            }
        }

    
    public List<List<String>> solveNQueens(int n) {

        List<int[]> solutions= new ArrayList<>();
        int[] boards  = new int[n];
        solve(0, n, boards, solutions);

        List<List<String>> finalList = new ArrayList<>();

        for(int[] ans : solutions){
            List<String> sl = new ArrayList<>();
            for (int i=0;i<ans.length;i++){
                char[] row = new char[n];
                Arrays.fill(row, '.');
                row[ans[i]] = 'Q';
                String s = new String(row);
                sl.add(s);
            }
            finalList.add(sl);

        }

        
        return finalList;

    }
}
    
}
