class Solution {
    public int arrangeCoins(int n) {
        // int sum = 0 ; 
        // int i = 1;
        // int c=0;
        // while((sum+i)<=n){
        //     sum = sum + i;
        //     i++;
        //     c++;
        // }
        // return c;
        int i=1,j=0;
        while(n>=0){
            n-=i;
            i+=1;
            j+=1;
        }
        return j-1;//upto last row is our completed row
    }
}