package org.karthick.dsa.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    public static void breadthFirstSearch(int[][] g, int start) {

        int length = g[0].length;
        int u;
        int[] visited = new int[length];
        Queue<Integer> q = new LinkedList<>();

        System.out.print(" " + start);
        visited[start] = 1;
        q.add(start);
        while(!q.isEmpty()){
            u = q.remove();
            for(int v = 1; v < length; v++){
                if(g[u][v] == 1 && visited[v] == 0){
                    System.out.print(" " + v);
                    visited[v] = 1;
                    q.add(v);
                }
            }
        }


    }
    static int[] dfsVisited;
    public static void depthFirstSearch(int[][] g, int start) {
        int length = g[0].length;
        if(dfsVisited == null)
            dfsVisited = new int[length];

        if(dfsVisited[start] == 0){
            System.out.print(" " + start);
            dfsVisited[start] = 1;

            for (int j = 1; j < length; j++){
                if(g[start][j] == 1 && dfsVisited[j] == 0){
                    depthFirstSearch(g,j);
                }
            }
        }
    }
}
