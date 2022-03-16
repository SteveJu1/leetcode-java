public class P_344 {
    public void reverseString(char[] s) {
        if (s.length == 0) {
            return;
        }
        for (int left = 0, right = s.length - 1; left < right; left++, right--) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }
}
