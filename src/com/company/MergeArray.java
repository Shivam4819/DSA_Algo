package com.company;

public class MergeArray {
    public void merge(int[] a, int[] b){
        int val=0;
        for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i]>b[j]){
                    val=a[i];
                    a[i]=b[j];
                    b[j]=val;
                }
            }
        }

        for(int k:a){
            System.out.print(k+" ");
        }
        System.out.println();
        for(int i:b){
            System.out.print(i+" ");
        }

    }

    public void mergeController(){
        int a[]={1,5,9,10,15,20};
        int b[]={2,3,8,13};

        merge(a,b);
    }

}
