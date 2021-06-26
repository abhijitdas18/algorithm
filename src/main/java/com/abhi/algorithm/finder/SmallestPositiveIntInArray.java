package com.abhi.algorithm.finder;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SmallestPositiveIntInArray {
    public static void main(String[] args) {
        Integer [] myArr = {1,3,6,4,1,2};
        smallestPositiveIntegerInArray(myArr);
    }

    public static int smallestPositiveIntegerInArray(Integer [] myArr){

        List<Integer> listOfNo = Arrays.asList(myArr);
        //sort the array in asc order
        TreeSet<Integer> treeSetOfNo = new TreeSet<>(listOfNo);

        int maxSmallestInt = treeSetOfNo.last();
        int requiredSmallestPositiveNo = 0;
        System.out.println("maxSmallestInt : " + maxSmallestInt);
        //Convert set to array to access by index
        Integer [] sortArr = new Integer[treeSetOfNo.size()];
        sortArr = treeSetOfNo.toArray(sortArr);


        for(int i = 0; i <= maxSmallestInt + 1; i++){
            for(int j = 0; j<=sortArr.length; j++){
                //if(sortArr[j]< requiredSmallestPositiveNo)
            }
        }

        return 0;
    }
}
