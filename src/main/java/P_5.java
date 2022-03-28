public class P_5 {
    /*
    https://leetcode-cn.com/problems/longest-palindromic-substring/
     */
    /*
    DP[i][j] i,j是起始点
     */
/*    public String longestPalindrome(String s) {
        int n =s.length();
        String res = "";
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < ; i++) {
            
        }
    }*/
    /*
        中心扩张法
        遍历每个字符往外扩张 更新起点和最大长度 start maxlen
     */
    private int start, maxLen;
    public String longestPalindrome1(String s) {
        // a b c c c c b d
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(start, start + maxLen);
    }

    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (maxLen < right - left - 1) {
            start = left + 1;
            maxLen = right - left - 1;
        }
    }
}
