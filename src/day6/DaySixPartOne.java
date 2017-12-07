package day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DaySixPartOne {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("C://Users//i851169//git//advent-of-code-2017//src//day6//input.txt"))) {
			String line = null, input = null;
			while ((line = br.readLine()) != null) {
				input = line;
			}
			String s[] = input.split("\t");
			int block[] = new int[s.length];
			for (int i = 0; i < block.length; i++) {
				block[i] = Integer.parseInt(s[i]);
			}
			int max = 0;
			boolean isEqual = false;
			int i, j = 0;
			int count = 0;
			ArrayList<int[]> arrays = new ArrayList<int[]>();
			while (isEqual == false) {
				for (i = 0; i < block.length; i++) {
					if (block[i] > max) {
						max = block[i];
						j = i;
					}
				}
				realocateValues(block, max, j);
				max = -1;
				count++;
				isEqual = containsInArray(arrays, block.clone());
				arrays.add(block.clone());
			}
			System.out.println(count);
		}

	}

	private static boolean containsInArray(ArrayList<int[]> arrays, int[] clone) {
		int count = 0;
		for (int[] array : arrays) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == clone[i])
					count++;
				if (count == array.length)
					return true;
			}
			count = 0;
		}
		return false;
	}

	private static void realocateValues(int[] block, int max, int index) {
		int a = index + 1;
		while (block[index] > 0) {
			try {
				if (a == index)
					a++;
				else {
					block[a] += 1;
					block[index] -= 1;
					a++;
				}
			} catch (Exception e) {
				a = 0;
			}

		}
	}
}
