package org.karthick.dsa.graph.prims;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimsMinimumSpanningTreeTest {

    private static final Integer I = Integer.MAX_VALUE;

    @Test
    public void test() {
        int[][] cost   = {
            {I, I, I, I, I, I, I, I},
            {I, I, 25, I, I, I, 5, I},
            {I, 25, I, 12, I, I, I, 10},
            {I, I, 12, I, 8, I, I, I},
            {I, I, I, 8, I, 16, I, 14},
            {I, I, I, I, 16, I, 20, 18},
            {I, 5, I, I, I, 20, I, I},
            {I, I, 10, I, 14, 18, I, I},
        };

        PrimsMinimumSpanningTree.minimumSpanningTree(cost);
    }

}