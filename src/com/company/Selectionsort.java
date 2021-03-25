package com.company;

public class Selectionsort {
    public void sort(int[] arr){
        int min=0;
        for (int i = 0; i < arr.length-1; i++) {
            min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

        }
        for (int k:arr) {
            System.out.print(k+" ");
        }
    }
    public void selectionController(){
        int arr[]={9,1,2,7,3,6,4,5};
        sort(arr);
    }
}
