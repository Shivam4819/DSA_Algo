package com.company;

public class MinSwap {
    public void minNoSwap(int[] a, int val){
        int left=0;
        int right=a.length-1;
        int swap=0;
        while (left<right){
            if(a[left]<=val)
                left++;
            else if (a[right]>val)
                right--;
            else {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                swap++;

            }
        }

        for (int j:a) {
            System.out.print(j+" ");
        }
        System.out.println("swap-"+swap);

    }
    public void SwapController(){
        int a[]={1,21,2,20,3,19,4,18,5,17,6,16,7,15,8,14,9,13};
        int val=11;
        minNoSwap(a,val);
    }
}
