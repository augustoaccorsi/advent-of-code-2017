package day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DayFivePartOne {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int step[] = null;
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C://Users//i851169//git//advent-of-code-2017//src//day5//input.txt"))) {
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				i++;
			}
			step = new int[i];
		}

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C://Users//i851169//git//advent-of-code-2017//src//day5//input.txt"))) {
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				step[i] = Integer.parseInt(line);
				i++;
			}
		}
		int offset = 0;
		for (int i = 0; i < step.length; i++) {

		}
		int i = 0, exit = 0;
		while (i < step.length) {
			try {
				int value = step[i];
				step[i] += 1;
				i += value;
				exit++;
			} catch (Exception e) {

			}
		}
		System.out.println(exit);
	}

}
