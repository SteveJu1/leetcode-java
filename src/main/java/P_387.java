import java.util.HashMap;

public class P_387 {
    /*
    https://leetcode-cn.com/problems/first-unique-character-in-a-string/
    思路：遍历两边，第一遍把字符存在map里 value是次数
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            int charCount = hashmap.getOrDefault(s.charAt(i), 0) + 1;
            hashmap.put(s.charAt(i), charCount);
        }

        for (int i = 0; i < s.length(); i++) {
            if (hashmap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
