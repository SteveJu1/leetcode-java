public class P_125 {
    /*
    给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    输入: "A man, a plan, a canal: Panama"
输出: true
解释："amanaplanacanalpanama" 是回文串
*/
    /*
思路：把非字母字符去掉生成新的string
string 和 revert 后的string 比较
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stringBuffer.append(ch);
            }

        }

        return stringBuffer.toString().equals(stringBuffer.reverse().toString());
    }

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        P_125 p_125 = new P_125();
        p_125.isPalindrome(a);
    }
}
