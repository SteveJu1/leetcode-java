public class P_14 {
    /*
    flower 以第一个字为基础
    flow
    flight
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) { //遍历第一个字符串的所以列
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {  //比较其他所有字符的这一列是否相等
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }



    public String longestCommonPrefix1(String[] strs) {
        char[] firstStr = strs[0].toCharArray();
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            char[] otherStr = str.toCharArray();
            int index = 0;

            while (index < otherStr.length && index < firstStr.length) {
                if (firstStr[index] != otherStr[index]) {
                    break;
                }
                index++;
            }

            min = Math.min(index, min);
        }
        return strs[0].substring(0, min);
    }
    /*
    trie
     */
}
