package com.streamsets.interview;

import java.util.ArrayList;

public class EncapGraph {
  private int totalVertices;
  private ArrayList<ArrayList<Integer>> arrayListOfAdj;
  private ArrayList<Integer> Visited;

  public int getTotalVertices() {
    return totalVertices;
  }

  public void setTotalVertices(int totalVertices) {
    this.totalVertices = totalVertices;
  }

  public ArrayList<ArrayList<Integer>> getArrayListOfAdj() {
    return arrayListOfAdj;
  }

  public void setArrayListOfAdj(ArrayList<ArrayList<Integer>> arrayListOfAdj) {
    this.arrayListOfAdj = arrayListOfAdj;
  }

  public ArrayList<Integer> getVisited() {
    return Visited;
  }

  public void setVisited(ArrayList<Integer> visited) {
    Visited = visited;
  }
}
