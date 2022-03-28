import java.util.Arrays;

public class P_242 {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }

    /*
    遍历第一个字符往数组里加出现的次数
    遍历第二个字符往数组里减少次数
     */
    public boolean isAnagram1(String s1, String s2) {
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (--freq[s2.charAt(i)] < 0) {
                return false;
            }
        }
        return s1.length() == s2.length();
    }

}
