package pack;

import java.util.HashMap;

public class GraphNode {
    HashMap<Integer, UndirectedGraphNode> nodeLookup = new HashMap<>();

    GraphNode(HashMap<Integer, UndirectedGraphNode> nodeLookup) {
        this.nodeLookup = nodeLookup;
    }

    public UndirectedGraphNode getNode(Integer i) {
        return nodeLookup.get(i);
    }

    public void addEdge(Integer source, Integer destination) {
        UndirectedGraphNode sourceNode = getNode(source);
        UndirectedGraphNode destinationNode = getNode(destination);
        sourceNode.neighbors.add(destinationNode);
    }
}
