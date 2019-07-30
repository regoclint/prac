package pack;

import java.util.LinkedList;
import java.util.List;

public class Node {
    int val;
    List<Node> children;

    Node() {}
    Node(int value)
    {
        this.val =value;
    }
}
