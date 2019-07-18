package pack;

import java.util.LinkedList;

public class UndirectedGraphNode {
    int value;
    LinkedList<UndirectedGraphNode> neighbors =new LinkedList<UndirectedGraphNode>();

    UndirectedGraphNode(int value)
    {
        this.value =value;
    }
}
