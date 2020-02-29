// https://leetcode.com/problems/valid-sudoku/

class Solution {
    /*
        n: number of entries in board
        time: O(n)
        space: O(n)
        we can say that n is constant (we know a 9x9 board), it is ok to say both complexities is O(1)
    */
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                char val = board[row][col];
                
                if(val == '.') continue;
                
                String rKey = rowKey(row, val);
                String cKey = colKey(col, val);
                String bKey = boxKey(row, col, val);
                
                if(set.contains(rKey) || set.contains(cKey) || set.contains(bKey)) 
                    return false;
                
                set.add(rKey);
                set.add(cKey);
                set.add(bKey);
            }
        }
        
        return true;
    }
    
    private String rowKey(int row, char val) {
        return "r_" + row + "_" + val;
    }
    
    private String colKey(int col, char val) {
        return "c_" + col + "_" + val;
    }
    
    private String boxKey(int row, int col, char val) {
        int box = 3 * (row / 3) + (col / 3);
        return "b_" + box + "_" + val;
    }
}
