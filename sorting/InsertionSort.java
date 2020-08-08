package com.algo.sorting;
/*
Algorithm
for j = 2 to n
key = A[j]
// Insert A[j] into the sorted sequence A[1..j-1]
i = j - 1
while i > 0 and A[i] > key
A[i + 1] = A[i]
i = i-1
A[i+1] = key
 */



public class InsertionSort {
    public static void main(String[] args) {
        int [] val = new int[]{1,5,11,5,8,5,12,22,3,7};
        insertionsSort(val);
    }
    static void insertionsSort(int [] val){

        for(int j=1; j<val.length;j++){
           int key = val[j];
           int i = j-1;
           while(i>=0 && val[i]<key){
               val[i+1] = val[i];
               i=i-1;
               val[i+1] = key;
           }

        }
        for(int i : val){
            System.out.print(i+", ");

        }
    }
}
