package com.company;

public class PartitionZeroOnes {

    public void partition(int[] a){
        int zeroCount=0, oneCount=0;
        int i=0;
        for (int j : a) {
            if (j == 0)
                zeroCount++;
            else
                oneCount++;
        }

        while (i<zeroCount){
            a[i]=0;
            i++;
        }
        while (i<a.length){
            a[i]=1;
            i++;
        }

        for (int j:a) {
            System.out.print(j+" ");
        }
    }

    public void partitionController(){
        int a[]={0,1,1,0,1,0,1,1,0,0,0,1};
        partition(a);
    }
}
