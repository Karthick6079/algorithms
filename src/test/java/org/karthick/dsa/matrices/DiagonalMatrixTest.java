package org.karthick.dsa.matrices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalMatrixTest {

    @Test
    public void test() {
        DiagonalMatrix matrix = new DiagonalMatrix(5);
        matrix.set(1,1,5);
        matrix.set(2,2,6);
        matrix.set(3,3,7);
        matrix.set(4,4,8);
        matrix.set(5,5,9);

        matrix.display();
    }

}