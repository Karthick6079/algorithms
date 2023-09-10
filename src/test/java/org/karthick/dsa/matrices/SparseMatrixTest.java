package org.karthick.dsa.matrices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparseMatrixTest {

    @Test
    public void testSparseMatrixAddMethod() {
        SparseMatrix s1 = getSparseMatrixS1();
        SparseMatrix s2 = getSparseMatrixS2();

        SparseMatrix result = s1.add(s2);
        result.display();


    }

    private SparseMatrix getSparseMatrixS1(){

        // We can optimize this matrix creation by reading the values from excel.
        Element ele1 = new Element(1,4,7);
        Element ele2 = new Element(2,1,1);
        Element ele3 = new Element(2,4,3);

        Element ele4 = new Element(3,2,2);
        Element ele5 = new Element(4,2,7);
        Element ele6 = new Element(4,4,3);

        Element[] elements = new Element[6];
        elements[0] = ele1;
        elements[1] = ele2;
        elements[2] = ele3;
        elements[3] = ele4;
        elements[4] = ele5;
        elements[5] = ele6;

        return new SparseMatrix(4,5,6, elements);
    }

    private SparseMatrix getSparseMatrixS2(){

        // We can optimize this matrix creation by reading the values from excel.
        Element ele1 = new Element(1,4,1);
        Element ele2 = new Element(2,2,2);
        Element ele3 = new Element(2,4,3);

        Element ele4 = new Element(3,1,1);
        Element ele5 = new Element(3,4,5);
        Element ele6 = new Element(4,1,7);
        Element ele7 = new Element(4,3,2);

        Element[] elements = new Element[7];
        elements[0] = ele1;
        elements[1] = ele2;
        elements[2] = ele3;
        elements[3] = ele4;
        elements[4] = ele5;
        elements[5] = ele6;
        elements[6] = ele7;


        return new SparseMatrix(4,5,7, elements);
    }

}