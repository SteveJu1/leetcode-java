import java.util.Arrays;
import java.util.Collections;

public class P_151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +"); //+代表多个空格
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
