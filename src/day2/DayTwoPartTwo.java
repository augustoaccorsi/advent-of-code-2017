package day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DayTwoPartTwo {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\i851169\\Documents\\Projects\\Dev\\Java\\adv-of-code\\bin\\day2\\inputDayTwo.txt"))) {
			String line;
			String[] input;
			String array[] = null;
			int checksum[] = new int[16];
			int max, min, result = 0, index = 0, valuei, valuej;
			while ((line = br.readLine()) != null) {
				input = line.split("\t");
				for(int i = 0; i < input.length; i ++){
					for(int j = 0; j < input.length; j ++){
						valuei = Integer.parseInt(input[i]);
						valuej = Integer.parseInt(input[j]);
						if(j != i){
							if(valuei % valuej == 0){
								checksum[index] = valuei / valuej;
							}
							else if(valuej % valuei == 0){
								checksum[index] = valuej / valuei;
							}
						}
					}
				}
				index++;
			}
			for (int i = 0; i < checksum.length; i++) {
				result += checksum[i];
			}
			System.out.println(result);
		}
	}

}
