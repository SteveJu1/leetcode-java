public class P_208 {
    /*
    https://leetcode-cn.com/problems/implement-trie-prefix-tree/

     */

  /*  class Trie {

        public Trie() {

        }

        public void insert(String word) {

        }

        public boolean search(String word) {

        }

        public boolean startsWith(String prefix) {

        }

        Node root;
        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            Node item = root;
            for (char ch : word.toCharArray()) {
                int idx = ch-'a';
                if (item.next[idx] == null) item.next[idx] = new Node();
                item = item.next[idx];
            }
            item.leaf = true;
        }

        public boolean search(String word) {
            Node item = root;
            for (char ch : word.toCharArray()) {
                int idx = ch-'a';
                if (item.next[idx] == null) return false;
                item = item.next[idx];
            }
            return item.leaf;
        }

        public boolean startsWith(String prefix) {
            Node item = root;
            for (char ch : prefix.toCharArray()) {
                int idx = ch-'a';
                if (item.next[idx] == null) return false;
                item = item.next[idx];
            }
            return true;
        }

        class Node {
            Node[] next;
            boolean leaf;
            Node(){
                next = new Node[26];
            }
        }
    }*/

}
