package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BubbleSort bubbleSort=new BubbleSort();
       // bubbleSort.bubbleController();

        InsertionSort insertionSort=new InsertionSort();
      //  insertionSort.insertionController();

        Selectionsort selectionsort=new Selectionsort();
       // selectionsort.selectionController();

        PartitionZeroOnes partitionZeroOnes=new PartitionZeroOnes();
       // partitionZeroOnes.partitionController();

        RangePartition rangePartition=new RangePartition();
        rangePartition.rangeController();
    }
}
