package com.streamsets.interview;

import java.util.ArrayList;

public class UndirectedGraph {
  EncapGraph encapGraph = new EncapGraph();

  public UndirectedGraph(int totalVertices) {
    encapGraph.setTotalVertices(totalVertices);
    encapGraph.setArrayListOfAdj(new ArrayList<ArrayList<Integer>>());
    encapGraph.setVisited(new ArrayList<Integer>());

    for (int i = 0; i < totalVertices; i++) {
      encapGraph.getVisited().add(-1);
      encapGraph.getArrayListOfAdj().add(i, new ArrayList<Integer>());
    }
  }

  /**
   * + ADD ALL THE EDGES
   *
   * @param source vertex
   * @param destination vertex
   */
  public void adjoinEdges(int source, int destination) {
    encapGraph.getArrayListOfAdj().get(source).add(destination);
    encapGraph.getArrayListOfAdj().get(destination).add(source);
  }

  /***
   * Utilized DFS
   * @param vertices nodes
   * @param visited isVisited
   */
  public void isVisitedDFS(int vertices, ArrayList<Integer> visited) {
    visited.set(vertices, 1);
    System.out.print(vertices + " ");

    for (int i : encapGraph.getArrayListOfAdj().get(vertices)) {
      if (visited.get(i) == -1) {
        isVisitedDFS(i, visited);
      }
    }
  }

  /** Get all the linked vertices */
  public void getLinkedNodes() {
    for (int i = 0; i < encapGraph.getTotalVertices(); i++) {
      if (encapGraph.getVisited().get(i) == -1) {
        isVisitedDFS(i, encapGraph.getVisited());
        System.out.println();
      }
    }
  }
}
