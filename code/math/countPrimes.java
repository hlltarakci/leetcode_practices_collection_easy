// https://leetcode.com/problems/count-primes/

class Solution {
   public int countPrimes(int n) {
        boolean[] isNotPrimeArray = new boolean[n+1];
        if(n < 2) return 0;
        
        int count = 0;
        for(int i=2; i<n; i++) {
            if(isNotPrimeArray[i]) continue;
            boolean isThisPrime = isPrime(i);
            if(isThisPrime) {
                count++;
                fillForward(isNotPrimeArray, i);
            }
        }
        
        return count;
    }
    
    public boolean isPrime(int n) {
        for(int i=2; i*i<n; i++) {
            if( n % i == 0) return false;
        }
        
        return true;
    }
    
    private void fillForward(boolean arr[], int k) {
        for(int i=k; i<arr.length; i+=k) 
            arr[i] = true;
    }
    
 }
