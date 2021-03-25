package com.company;

public class InsertionSort {
    public void sort(int[] arr){
        int temp,j;
        for (int i = 1; i <arr.length ; i++) {
            temp=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

        for (int k : arr) {
            System.out.println(k);
        }
    }
    public void insertionController(){
        int arr[]={9,1,2,7,3,6,4,5};
        sort(arr);
    }
}
