package com.abhi.algorithm.stringmanupulation;

import java.util.TreeSet;

/**
 * Given two sorted Array of integer given.
 * Create a array with sorted integer  
 * @author AbDas
 *
 */
public class ArrayOperation {

	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {6,7,8,9,10};
		
		int size1 = arr1.length;
		int size2 = arr2.length;

		TreeSet<Integer> result = new TreeSet<>();
		for(int a : arr1)
		{
			result.add(a);
		}
		for(int a : arr2)
		{
			result.add(a);
		}
		System.out.println("New sorted :" + result);

	   
	}

}
