// space optimization

class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        
        // int [] dp = new int [n];
        // Arrays.fill(dp,-1);
        
        int prev = nums[0];
        int prev2 = 0;
        for ( int i = 1 ; i < n ; i++){
            
            int pick = nums[i];
            
            if(i > 1) pick = pick + prev2;
            
            int notPick = prev;
            
            int curi = Math.max(pick,notPick);
            
            
            prev2 = prev;
            prev = curi;            
                
        }
        return prev;
    }
    
}