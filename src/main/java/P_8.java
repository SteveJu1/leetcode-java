public class P_8 {
    /*
    https://leetcode-cn.com/problems/string-to-integer-atoi/
     */
    public int myAtoi(String s) {
        //1. Empty string " "
        int index = 0, sign = 1, total = 0;  // sign 符号 total绝对值
        if (s.length() == 0){ return 0;}


        //2.Remove Spaces  s = s.trim();
        while (s.charAt(index) == ' ' && index < s.length()) {
            index++;
        }

        //3.handle signs
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        //4.convert number and avoid overflow
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            if (Integer.MAX_VALUE / 10 < total ||
                    Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }

}
