public class TrieNode {
    TrieNode[] next;
    String word;

    TrieNode(int size) {
        next = new TrieNode[size];
    }
}
