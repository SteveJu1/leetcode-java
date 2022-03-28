public class P_58 {
    /*
    https://leetcode-cn.com/problems/length-of-last-word/

     把最后空的过滤掉 从后遍历到第一个结束
     */
    public int lengthofLastWord(String s) {
        int length = s.length() - 1;
        while (s.charAt(length) == ' ') {
            length--;
        }
        int res = 0;
        while (length >= 0 && s.charAt(length) != ' ') {
            length--;
            res++;
        }
        return res;
    }

}
