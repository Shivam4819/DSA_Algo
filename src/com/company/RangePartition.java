package com.company;

public class RangePartition {
    public void range(int[] a, int low, int high){
        int start=0;
        int end=a.length-1;
        for (int i = 0; i <= end;) {
            if (a[i]<low){
                int temp=a[start];
                a[start]=a[i];
                a[i]=temp;
                i++;
                start++;
            }
            else if (a[i]>high){
                int temp= a[end];
                a[end]=a[i];
                a[i]=temp;
                end--;
            }
            else
                i++;
        }

        for (int j:a) {
            System.out.print(j+" ");
        }
    }

    public void rangeController(){
        int a[]={1,21,2,20,3,19,4,18,5,17,6,16,7,15,8,14,9,13};
        int high=12;
        int low=9;
        range(a,low,high);
    }
}
