package day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DayTwoPartOne {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\i851169\\Documents\\Projects\\Dev\\Java\\adv-of-code\\bin\\day2\\inputPartOne.txt"))) {
			String line;
			String[] input;
			String array[] = null;
			int checksum[] = new int[16];
			int max, min, result = 0, index=0;
			while ((line = br.readLine()) != null) {
				input = line.split("\t");
					max = findMax(input);
					min = findMin(input);
					checksum[index] = max - min;
					index++;
			}
			for (int i = 0; i < checksum.length; i++) {
				result += checksum[i];
			}
			System.out.println(result);
		}
	}

	private static int findMax(String[] array) {
		int max = 0;
		int value;
		for (int i = 0; i < array.length; i++) {
			value = Integer.parseInt(array[i]);
			if (value > max) {
				max = value;
			}
		}
		return max;
	}

	private static int findMin(String[] array) {
		int min = 999999999;
		int value;
		for (int i = 0; i < array.length; i++) {
			value = Integer.parseInt(array[i]);
			if (value < min) {
				min = value;
			}
		}
		return min;
	}

}
