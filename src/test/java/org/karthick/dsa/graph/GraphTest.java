package org.karthick.dsa.graph;

import org.junit.jupiter.api.Test;

class GraphTest {

    @Test
    public void testGraphBFSFromNodeOne() {
        int[][] g = {
                        {0,0,0,0,0,0,0},
                        {0,0,1,1,0,0,0},
                        {0,1,0,0,1,0,0},
                        {0,1,0,0,1,0,0},
                        {0,0,1,1,0,1,1},
                        {0,0,0,0,1,0,0},
                        {0,0,0,0,1,0,0}
                    };

        Graph.breadthFirstSearch(g,1);
    }

    @Test
    public void testGraphBFSFromNodeTwo() {
        int[][] g = {
                {0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0},
                {0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}
        };

        Graph.breadthFirstSearch(g,2);
    }

    @Test
    public void testGraphDFSFromNodeOne() {
        int[][] g = {
                {0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0},
                {0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}
        };

        Graph.depthFirstSearch(g,1);
    }

    @Test
    public void testGraphDFSFromNodeTwo() {
        int[][] g = {
                {0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0},
                {0,1,0,0,1,0,0},
                {0,1,0,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}
        };

        Graph.depthFirstSearch(g,2);
    }

}