class Solution {
    private static int MOD = (int) 1e9 + 7;

    public int numWays(String[] words, String target) {
        int w_length = words[0].length();
        int t_length = target.length();
        int[][] dics = new int[w_length + 1][26];
        for (String word : words) {
            char[] wordArray = word.toCharArray();
			for (int i = 1; i <= w_length; i++) 
				dics[i][wordArray[i - 1] - 'a']++;
        }

        long[][] opt = new long[w_length + 1][t_length + 1];
        for (int i = 0; i <= w_length; i++)
			opt[i][0] = 1;
		for (int i = 1; i <= t_length; i++) {
			int to = w_length - t_length + i;
			int c = target.charAt(i - 1) - 'a';
			for (int j = i; j <= to; j++) {
				long cur =  opt[j - 1][i] + opt[j - 1][i - 1] * dics[j][c];
				opt[j][i] = (cur + MOD) % MOD;
			}
		}
		return (int) opt[w_length][t_length];
    }
}