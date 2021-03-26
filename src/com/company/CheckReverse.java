package com.company;

public class CheckReverse {

    public void check(int[] a){
        int temp;
        int[] b=new int[a.length];
        for(int j=0;j<a.length;j++){
            b[j]=a[j];
        }

        for (int j:b){
            System.out.print(j+" ");
        }
        System.out.println();
        for (int i=0;i<b.length-1;i++){
            for(int j=0;j<b.length-i-1;j++){
                if(b[j]>b[j+1]){
                 temp=b[j];
                 b[j]=b[j+1];
                 b[j+1]=temp;
                }
            }
        }

        int start=0,last=b.length-1;
        while (a[start]==b[start])
            start++;
        while (a[last]==b[last])
            last--;

        System.out.println("start-"+a[start]);
        System.out.println("last-"+a[last]);
        for(int i:b){
            System.out.print(i+" ");
        }
        int i=start,flag=0;
        while (i<last){
            if(a[i]>a[i+1]){
                i++;
                flag=1;
            }
            else
                flag=0;
                break;
        }
        i=start;
        if (flag==1)
            System.out.println("reverse possible");
        else
            System.out.println("not possible");

    }
    public void reverseController(){
        int a[]={1,2,5,4,3};
        check(a);
    }
}
