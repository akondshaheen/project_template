package com.streamsets.interview;

public class Main {

  public static void main(String[] args) {
    UndirectedGraph undirGraph = new UndirectedGraph(5);

    // Given edges are added to the graph
    undirGraph.adjoinEdges(1, 0);
    undirGraph.adjoinEdges(1, 2);
    undirGraph.adjoinEdges(3, 4);

    System.out.println("These are identified connected components: ");
    undirGraph.getLinkedNodes();
  }
}
