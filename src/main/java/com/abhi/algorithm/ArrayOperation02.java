package com.abhi.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * A array is given.
 * Find out array start with all even and followed by odd
 * e.g.
 * Given array = {1,2,3,4,5,6,7,8,9};
 * o/p = {2,4,6,8,1,3,5,7,9};
 * @author AbDas
 *
 */
public class ArrayOperation02 {

	public static void main(String[] args) {

		int []  arr = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();

		for(int i : arr)
		{
			if(i %2 == 0)
			{
				even.add(i);
			}
			else
				odd.add(i);
		}
		System.out.println("Even :" + even);
		System.out.println("Odd:"+ odd);
		
		even.addAll(odd);
		System.out.println("Result :" + even);
		
	}

}
