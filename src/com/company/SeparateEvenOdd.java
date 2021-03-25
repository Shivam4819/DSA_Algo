package com.company;

public class SeparateEvenOdd {

    public void separate(int[] a){
        int start=0;
        int last=a.length-1;

        while (start<last){
            if (a[start]%2==0)
                start++;
            else if(a[last]%2!=0)
                last--;
            else{
                int temp=a[last];
                a[last]=a[start];
                a[start]=temp;
             }
        }
        for (int j:a) {
            System.out.print(j+" ");
        }
    }
    public void EvenOddController(){
        int a[]={9,1,8,2,7,3,6,4,5};
        separate(a);

    }
}
