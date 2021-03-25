package com.company;

public class BubbleSort {
    public void sort(int[] arr){
        int temp=0;
        boolean flag=true;
        for (int i = 0; i < arr.length-1; i++) {
            flag=false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   flag=true;
                }
            }
            if (flag==false){
                break;
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
    public void bubbleController(){
        int arr[]={9,1,2,7,3,6,4,5};
        sort(arr);
    }
}
