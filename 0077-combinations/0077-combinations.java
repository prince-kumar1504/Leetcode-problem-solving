class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        solve(n, k, new ArrayList<>(), 1);
        return ans;
    }

    private void solve(int n, int k, List<Integer> current, int num) {
        if(k==0) {
            // We have the number of elements desired
            ans.add(new ArrayList<>(current));
            return;
        }
        if(num>n) return;

        // Include this number
        current.add(num);
        solve(n, k-1, current, num+1);
        // Exclude this number (backtrack)
        current.remove(current.size()-1);
        solve(n, k, current, num+1);
    }
}