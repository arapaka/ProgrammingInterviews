package com.tutorialhorizon.com.arrays;

/**
 * Created by archithrapaka on 10/18/16.
 */
public class MergeSort {
    int arrSize;
    int[] arrinput;
    int[] auxArray;

    public MergeSort(int[] arrinput){
        this.arrinput = arrinput;
       arrSize = arrinput.length;
        auxArray = new int[arrSize];
    }

    public void sort(int low , int high){
         if(low < high){
             int mid = low + (high-low)/2;
             sort(low,mid);
             sort(mid+1,high);
             merge(low,mid,high);
         }
    }

    public int[] mergeSorting(){
        sort(0,arrSize-1);
        return arrinput;

    }

    public void merge(int low , int mid , int high){
        // copy the array into aux array ..

        for (int i = 0; i <= high; i++) {
            auxArray[i] = arrinput[i];
        }

        int i = low;
        int j = mid+1;
        int k = low;

        while (i <= mid && j<= high) {
                if(auxArray[i] < auxArray[j]){
                    arrinput[k] = auxArray[i];
                    i++;
                }
              else {
                    arrinput[k] = auxArray[j];
                    j++;
                }
            k++;
        }
        while (i <= mid){
            arrinput[k] = auxArray[i];
            i++;
            k++;
        }
    }

    public void displayArray(int [] b){
        for(int i=0;i<b.length;i++){
            System.out.print(" " + b[i]);
        }
    }

    public static void main(String[] args){
        int [] a = {2,1,6,3,9,4,5,10};
        MergeSort m = new MergeSort(a);
        int [] b = m.mergeSorting();
        m.displayArray(b);

    }
}
