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
        //rangePartition.rangeController();

        MinSwap minSwap=new MinSwap();
       // minSwap.SwapController();

        AbsDifference absDifference=new AbsDifference();
     //   absDifference.absDiffController();

        EquationSort equationSort=new EquationSort();
      //  equationSort.equController();

        SeparateEvenOdd separateEvenOdd=new SeparateEvenOdd();
       // separateEvenOdd.EvenOddController();

        MergeArray mergeArray=new MergeArray();
       // mergeArray.mergeController();

        CheckReverse checkReverse= new CheckReverse();
        checkReverse.reverseController();
    }
}
