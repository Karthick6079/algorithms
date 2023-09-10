package org.karthick.dsa.matrices;


/*
* Diagonal matrix we will have value only in diagonal
* Means when i == j only there will be value
* i != j there will be zero
* */
public class DiagonalMatrix {

    private int[] a;

    private int n;

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public DiagonalMatrix(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public DiagonalMatrix(int n) {
        this.n = n;
        this.a = new int[n];
    }

    public void set( int i, int j, int element){
        if(i == j){
            a[i-1] = element;
        }
    }

    public int get(int i, int j){
        if(i != j){
            return 0;
        }
        else{
            return a[i-1];
        }
    }

    public void display(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i==j){
                    System.out.printf("%d ", get(i+1,j+1));
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
