// https://leetcode.com/problems/pascals-triangle/

class Solution {
    /*  
        time: O(n^2)
        space: O(1) -- output excluded
            output takes O(n^2) space
    */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        
        for(int i=0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            
            for(int j=1; j < i ; j++) {
                row.add(rows.get(i-1).get(j-1) + rows.get(i-1).get(j));
            }
            
            if(i > 0) row.add(1);
            rows.add(row);
        }
        
        return rows;
    }
}
