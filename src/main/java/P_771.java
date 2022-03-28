import java.util.HashSet;

public class P_771 {
    /*
    https://leetcode-cn.com/problems/jewels-and-stones/
     */
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hashSet = new HashSet();
        for (int i = 0; i < jewels.length(); i++) {
            hashSet.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (hashSet.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }

}
