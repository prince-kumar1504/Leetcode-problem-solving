class Solution {
    public int rob(int[] nums) {
        
         int n = nums.length;
        if ( n==1 ) return nums[0];
        
         ArrayList<Integer> arr1 = new ArrayList<>();
         ArrayList<Integer> arr2 = new ArrayList<>();
        
         for(int i = 0 ; i< n ; i++){
            
             if(i != 0 ) arr1.add(nums[i]);
             if(i != n-1 ) arr2.add(nums[i]);
         }
            
        
        int ans1 = solve(arr1);
        int ans2 = solve(arr2);
        
        return Math.max(ans1,ans2);
        
    }
    
    public int solve(ArrayList<Integer> nums){
        
        int n = nums.size();
        
        int prev = nums.get(0);      
        int prev2 = 0;
        for ( int i = 1 ; i < n ; i++){
            
            int pick = nums.get(i);
            
            if(i > 1) pick = pick + prev2;
            
            int notPick = prev;
            
            int curi = Math.max(pick,notPick);
            
            
            prev2 = prev;
            prev = curi;            
                
        }
        return prev;
    }
}