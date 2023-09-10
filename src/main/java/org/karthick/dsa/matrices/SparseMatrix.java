package org.karthick.dsa.matrices;

public class SparseMatrix {
    
    private int m;
    
    private int n;


    private int num;
    
    private Element[] elements;

    public SparseMatrix(int m, int n, int num, Element[] elements) {
        this.m = m;
        this.n = n;
        this.num = num;
        this.elements = elements;
    }

    public SparseMatrix add(SparseMatrix s2) {
        SparseMatrix result;
        Element[] rElements;
        int resultLength, i = 0, j = 0, k = 0;
        if(this.m != s2.m || this.n != s2.n){
            return null;
        }

        resultLength = this.num + s2.num;
        rElements = new Element[resultLength];
        result = new SparseMatrix(this.m, this.n, 0, rElements);

        while(i<this.num && j<s2.num){

            if(this.elements[i].getRow() < s2.elements[j].getRow()){
                result.elements[k++] = this.elements[i++];
            } else if(this.elements[i].getRow() > s2.elements[j].getRow()){
                result.elements[k++] = s2.elements[j++];
            } else{

                if(this.elements[i].getCol() < s2.elements[j].getCol()){
                    result.elements[k++] = this.elements[i++];
                } else if(this.elements[i].getCol() > s2.elements[j].getCol()){
                    result.elements[k++] = s2.elements[j++];
                } else {
                    result.elements[k] = this.elements[i];
                    result.elements[k++].setValue(this.elements[i].getValue() + s2.elements[j].getValue());
                    i++;
                    j++;
                }

            }
        }

        for(; i<this.num; i++)
            result.elements[k++] = this.elements[i];

        for(; j<s2.num; j++)
            result.elements[k++] = s2.elements[j];

        result.setNum(k);
        
        return result;
    }
    
    
    public void display(){
        int k = 0;
        Element element;
        for(int row = 1; row <= this.m; row++){

            for(int col = 1; col<= this.n ; col++){
                element = this.elements[k];

                if(element != null && row == element.getRow() && col == element.getCol()){
                    System.out.printf("%d ", this.elements[k++].getValue());
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
    

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Element[] getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = elements;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
