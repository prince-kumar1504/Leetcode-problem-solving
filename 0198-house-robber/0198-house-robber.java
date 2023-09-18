class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        
        int [] dp = new int [n];
        Arrays.fill(dp,-1);
        return solve(n-1, nums,dp);
    }
    
    public static int solve(int idx , int [] nums,int [] dp ){
        
        
        if(idx == 0) return nums[idx];
        
        if(idx < 0 ) return 0;
        
        if(dp[idx] != -1) return dp[idx];
        
        
        int pick = nums[idx] + solve(idx-2, nums,dp);
            
        int notPick = solve(idx-1,nums,dp);
        
        int maxAmount = Math.max(pick,notPick);
        
        
        return dp[idx]=maxAmount;
        
    }
}