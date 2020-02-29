// https://leetcode.com/problems/rotate-image/

class Solution {
    /*
        time: O(nm)
        space: O(1)
    */
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    
    private void transpose(int[][] matrix) {
        for(int r=0; r < matrix.length; r++) {
            for(int c=0; c < r; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
    }
    
    private void reverse(int[][] matrix) {
        for(int r=0; r < matrix.length; r++) {
            for(int c=0; c < matrix[0].length / 2 ; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][matrix[0].length - c - 1];
                matrix[r][matrix.length - c - 1] = temp;
            }
        }
    }
    
}
