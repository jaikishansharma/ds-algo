package com.algo.sorting;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = new int[]{1,23,2,43,56,21,2,5,8};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int lb, int ub){
if(ub>lb) {
    int mid = (lb + ub) / 2;
    mergeSort(arr, lb, mid);
    mergeSort(arr, mid + 1, ub);
    merge(arr, lb, mid, ub);
}
    }
    static void merge(int [] arr, int lb, int mid, int ub){
        int l = mid - lb+1;
        int r = ub - mid;

        int [] LeftArray = new int[l];
        int [] RightArray = new int[r];

        for(int i = 0; i<l; ++i)
            LeftArray[i] = arr[lb+i];
        for(int j = 0; j<r; ++j)
            RightArray[j] = arr[mid+1+j];

        int i = 0, j = 0;
        int k = lb;
        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
