package org.csource.common;

import java.util.Arrays;

public class Test {
	int[] newArr = new int[4];

	public static void main(String[] args) {
		Test test = new Test();
		test.index(0);
	}

	public int index(int index) {
		if (index == newArr.length) {
			System.out.println(Arrays.toString(newArr));
			return -1;
		}
		int[] old = { 3, 2, 1, 4 };
		newArr[index] = old[old.length - 1 - index];
		index++;

		return index(index);

	}

}
