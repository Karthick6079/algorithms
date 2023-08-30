package org.karthick.dsa.graph.prims;

import java.util.Arrays;

public class PrimsMinimumSpanningTree {

    private static final int INFINITE = Integer.MAX_VALUE;

    public static void minimumSpanningTree(int[][] cost) {
        int length = cost[0].length;
        int[] near = new int[length];
        int[][] target = new int[2][length - 2];
        Arrays.fill(near, INFINITE);
        //Select minimum edge from graph
        int[] minimumEdgeIndices = findMinimumEdge(cost);
        int u = minimumEdgeIndices[0];
        int v = minimumEdgeIndices[1];
        int min;

        // Mark indices of minimum edges zero
        near[u] = 0; near[v] = 0;
        target[0][0] = u;
        target[1][0] = v;

        // Update nearer array elements value, which vertices minimum from already selected vertices
        for (int i = 1; i < length; i++){
            if(near[i] != 0){
                if( cost[i][u] < cost[i][v] ){
                    near[i] = u;
                } else{
                    near[i] = v;
                }
            }

        }

        //Repeating step to fill the target array
        for(int i = 1; i < length - 2 ; i++){
            int k = 0;
            min = Integer.MAX_VALUE;
            //Find minimum edge, which connected to selected vertices
            for (int j = 1; j < length ; j++) {
                if(near[j] != 0 && cost[j][near[j]] < min){
                    min = cost[j][near[j]];
                    k = j;
                }
            }

            // Update the minimum edge in target array and mark according nearer array index as 0
            target[0][i] = k;
            target[1][i] = near[k];

            near[k] = 0;

            // Now again update the nearer array using the
            // new minimum vertex with already existing value in nearer value
            for (int j = 1; j < length ; j++) {
               if(near[j] != 0 && cost[j][k] < cost[j][near[k]]){
                   near[j] = k;
               }
            }
        }
        System.out.println("Minimum Spanning Tree\n");
        print2DArray(target);
    }

    private static void print2DArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] findMinimumEdge(int[][] cost) {
        int length = cost[0].length;

        int min = Integer.MAX_VALUE;
        int[] minimumEdgeIndices = new int[2] ;

        for(int i = 1; i < length; i++){
            for (int j = i; j < length; j++) {
                if(cost[i][j] < min){
                    min = cost[i][j];
                    minimumEdgeIndices[0] = i;
                    minimumEdgeIndices[1] = j;
                }
            }
        }
        return minimumEdgeIndices;

    }
}


