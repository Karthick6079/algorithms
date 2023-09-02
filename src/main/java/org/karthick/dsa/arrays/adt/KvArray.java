package org.karthick.dsa.arrays.adt;

public class KvArray {

    private int[] data;

    private int length;

    private int size;

    public int[] getData() {
        return data;
    }

    public int getLength() {
        return length;
    }

    public KvArray(int size) {
        this.size = size;
        this.data = new int[this.size];
        this.length = 0;
    }

    public void add(int x){
        this.data[length++] = x;
    }

    public void display(){
        for(int i = 0 ; i < length; i++){
            System.out.print(data[i] + " ");
        }
    }

    public void insert(int index, int value){
        if(index >= 0 && index < length){
            for(int i = length; i > index; i--){
                data[i] = data[i-1];
            }
            data[index] = value;
            length++;
        } else{
            throw new IllegalArgumentException("Invalid index");
        }
    }

    public int delete(int index){
        if(index >= 0 && index < length){
            int x = data [index];
            for(int i = index; i < length - 1; i++){
                data[i] = data[i+1];
            }
            length--;
            return x;
        } else{
            throw new IllegalArgumentException("Invalid index");
        }
    }

    public void swap(int start, int end){
        int temp;
        temp = data[start];
        data[start] = data[end];
        data[end] = temp;
    }

    public int linearSearch(int key){
        for(int i = 0; i < length; i++){
            if(key == data[i]){
                swap(i, i-1); // swap key element one step before, when key found
                return i-1;
            }

        }
        return -1;
    }




    public int binarySearch(int key){
        int mid;
        int low = 0;
        int high = length;

        while(low <= high){
            mid = (low + high) / 2;
            if(key == data[mid])
                return mid;
            else if( key < data[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }


    private int rBinarySearch(int low, int high, int key){
        int mid;

        if(low <= high){
            mid = (low + high) / 2;
            if(key == data[mid])
                return mid;
            else if( key < data[mid])
                return rBinarySearch(low, mid-1, key);
            else
                return rBinarySearch(mid+1, high, key);
        }
        return  -1;
    }

    public int get(int index){
        if(index >= 0 && index < length){
            return data[index];
        }
        return -1;
    }

    public void set(int index, int value){
        if(index >= 0 && index < length){
            data[index] = value;
        }
    }

    public int max(){
        int max = data[0];
        for(int i = 1; i < length; i++){
            if( data[i] > max)
                max = data[i];
        }

        return max;
    }

    public int min(){
        int min = data[0];
        for(int i = 1; i < length; i++){
            if( data[i] < min)
                min = data[i];
        }

        return min;
    }

    public int sum(){
        int sum = 0;
        for(int i = 1; i < length; i++){
            sum = sum + data[i];
        }
        return sum;
    }

    public int average(){
        int sum = 0;
        for(int i = 1; i < length; i++){
            sum = sum + data[i];
        }
        return sum/length;
    }

    public void leftShiftAndRotate(){
        int a = data[0];
        for(int i = 0; i < length -1 ; i++){
            data[i] = data[i+1];
        }
        data[length - 1]  =  a;
    }

    public void negativeNumberleftSide(){
        int i = 0;
        int j = length - 1;

        while (i < j){
            while(data[i] < 0)
                i++;
            while(data[j] >= 0)
                j--;
            if(i<j)
                swap(i, j);
        }
    }

    public boolean isSorted(){
        for(int i = 0 ; i < length - 1; i++){
            if(data[i+1] > data[i])
                return false;
        }
        return true;
    }

    public void insertAtSortedPosition(int element){
        int i = length - 1;

        while(data[i] > element){
            data[i+1] = data[i];
        }
        data[i+1] = element;
    }

    public int[] merge(KvArray arg1){
        int m = length;
        int n = arg1.length;
        int[] input = arg1.getData();

        int[] result = new int[m+n];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(data[i] < input[j]){
                result[k++] = data[i++];
            } else {
                result[k++] = input[j++];
            }
        }

        for(; i < m; i++){
            result[k++] = data[i];
        }

        for(; j < n; j++){
            result[k++] = input[j];
        }

        return result;
    }

    public int[] union(KvArray arg1){
        int m = length;
        int n = arg1.length;
        int[] input = arg1.getData();

        int[] result = new int[m+n];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(data[i] < input[j]){
                result[k++] = data[i++];
            } else if(data[i] > input[j]){
                result[k++] = input[j++];
            } else {
                result[k++] = input[i];
                i++;
                j++;
            }
        }

        for(; i < m; i++){
            result[k++] = data[i];
        }

        for(; j < n; j++){
            result[k++] = input[j];
        }
        return result;
    }


    public int[] intersection(KvArray arg1){
        int m = length;
        int n = arg1.length;
        int[] input = arg1.getData();

        int[] result = new int[Math.max(m, n)];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(data[i] < input[j]){
               i++;
            } else if(data[i] > input[j]){
                j++;
            } else {
                result[k++] = input[i];
                i++;
                j++;
            }
        }

        return result;
    }


    public int[] difference(KvArray arg1){
        int m = length;
        int n = arg1.length;
        int[] input = arg1.getData();

        int[] result = new int[m];
        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(data[i] < input[j]){
                result[k++] = data[i];
                i++;
            } else if(data[i] > input[j]){
                j++;
            } else {
                i++;
                j++;
            }
        }

        for(; i < m; i++){
            result[k++] = data[i];
        }


        return result;
    }

}
