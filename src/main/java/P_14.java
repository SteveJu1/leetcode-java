public class P_14 {
    /*
    strs = ["flower","flow","flight"]
    以第一个字为基础
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) { //遍历第一个字符串
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
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
}
