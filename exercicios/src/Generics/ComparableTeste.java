package Generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(-3);
		nums.add(600);
		
		for(Integer n : nums) { // ordem correta de acordo com comparablee
			System.out.println(n); // usar  o INTEGER COM O TREESET, POIS IMPLEMENTA O COMPARABLE A
		}
		

	}

}
