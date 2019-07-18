package pack;

import java.util.LinkedList;

public class UndirectedGraphNodeChar {
    char value;
    String order;
    LinkedList<UndirectedGraphNodeChar> neighbors =new LinkedList<UndirectedGraphNodeChar>();

    UndirectedGraphNodeChar(char value)
    {
        this.value =value;
    }
}
