class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        
        
        if(k > 0) {
            int sum = 0;
            for(int i = 1; i <= k; i++) sum += code[i];
            
            for(int i = 0; i < n; i++) {
                ans[i] = sum;
                sum -= code[(i+1) % n];
                sum += code[(k+i+1) % n];
            }
        }
        
        else if(k < 0) {
            int sum = 0;
            for(int i = n-2; i >= n+k-1; i--) sum += code[i];
            
            for(int i = n-1; i >= 0; i--) {
                ans[i] = sum;
                sum -= code[(i-1+n) % n];
                sum += code[(k+i-1+n) % n];
            }
        }
        
        return ans;
    }
}