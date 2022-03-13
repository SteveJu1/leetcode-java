import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class P_17 {
    /*
    递归写法
     */
    private Map<Character, String> map = new HashMap<>();
    private List<String> res = new LinkedList<>();

    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if (digits == null || digits.length() == 0) {
            return res;
        }
        dsf("", digits, 0);
        return res;
    }

    private void dsf(String path, String digits, int level) {
        if (level == digits.length()) {
            res.add(path);
            return;
        }
        //process
        String letters = map.get(digits.charAt(level));
        for (int i = 0; i < letters.length(); i++) {
            dsf(path + letters.charAt(i), digits, level + 1);
        }
    }

    public static void main(String[] args) {
        P_17 p_17 = new P_17();
        p_17.letterCombinations("23");
    }

    /*
        // 建立数字到字母映射
    private String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> pathList = new LinkedList<>(); //准备结果存储空间
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {  // 如果字符为空或长度为0，返回[]
            return pathList;
        }
        StringBuilder path = new StringBuilder();
        backtrack(path, digits); // 回溯过程 一般两个参数 path 回溯的索引
        return pathList;
    }

    public void backtrack(StringBuilder path, String digits) {
        if (path.length() == digits.length()) { //回溯边界条件 到达数的根节点
            pathList.add(path.toString());  //把回溯过程中的路径添加到结果
            return;
        }
        int currentDigit = digits.charAt(path.length()) - '0'; // 得到当前的数字
        String currentLetters = map[currentDigit];  // 得到当前的数字对应的字母
        for (char c : currentLetters.toCharArray()) { // 回溯套路 遍历
            path.append(c);                          //  添加路径
            backtrack(path, digits); // 进入下一个数字，
            path.deleteCharAt(path.length() - 1);    //  删除路径
        }
    }
     */
}
