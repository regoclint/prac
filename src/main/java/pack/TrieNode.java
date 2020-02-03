package pack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class TrieNode {
    TrieNode[] next;
    String word;
    TreeSet<String> topThreeSuggesstions;
    LinkedList<String> suggestion = new LinkedList<>();

    TrieNode(int size) {
        next = new TrieNode[size];
        topThreeSuggesstions=new TreeSet<>();
    }
}
