package com.company;

public class EquationSort {

    public void sortEquation(int[] a,int ref){

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(ref*a[j]*a[j]>ref*a[j+1]*a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int j:a){
            System.out.print(j+" ");
        }
    }
    public void equController(){
        int a[]={9,1,8,2,7,3,6,4,5};
        int ref=7;
        sortEquation(a,ref);
    }
}
