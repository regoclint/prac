package pack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
    int val;
    List<Node> children=new ArrayList<>();

    Node() {}
    Node(int value)
    {
        this.val =value;
    }
}
