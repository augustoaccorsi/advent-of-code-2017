package day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DayFourPartOne {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\i851169\\Documents\\Projects\\Dev\\advent-of-code-2017\\bin\\day4\\dayFourInput.txt"))) {
			String line;
			String[] password;
			boolean isValid = true;
			while ((line = br.readLine()) != null) {
				password = line.split(" ");
				for (int i = 0; i < password.length; i++) {
					for (int j = i+1; j < password.length; j++) {
						if (password[i].equals(password[j]) && i != j)
							isValid = false;
					}
				}
				if (!isValid){
					isValid = true;
				}					
				else{
					isValid = true;
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
