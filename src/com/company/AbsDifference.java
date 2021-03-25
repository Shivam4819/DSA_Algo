package com.company;

public class AbsDifference {
    public void sortAbsDiff(int[] a, int ref){

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(Math.abs(a[j]-ref)>Math.abs(a[j+1]-ref)){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for (int j:a) {
            System.out.print(j+" ");
        }
    }
    public void absDiffController(){
        int a[]={9,1,8,2,7,3,6,4,5};

        int ref=5;
        sortAbsDiff(a,ref);
    }
}
