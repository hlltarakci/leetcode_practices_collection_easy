// https://leetcode.com/problems/min-stack/

class MinStack {
    private class IntWithMin {
        private int val;
        private int minSoFar;
        public IntWithMin(int val, int minSoFar) {
            this.val = val;
            this.minSoFar = minSoFar;
        }
    }
    List<IntWithMin> list = new ArrayList<>();

    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        if(list.isEmpty())
            list.add(new IntWithMin(x, x));
        else 
            list.add(new IntWithMin(x, Math.min(getMin(), x)));
    }
    
    public void pop() {
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1).val;
    }
    
    public int getMin() {
        return list.get(list.size()-1).minSoFar;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
