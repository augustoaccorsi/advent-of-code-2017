package day3;

public class DayThreePartOne {

	public static void main(String[] args) {
		int input = 12;
		int root = 1;
		
//		17  16  15  14  13
//		18   5   4   3  12
//		19   6   1   2  11
//		20   7   8   9  10
//		21  22  23---> ...
		
		int array[][] = new int[5][5];
		
		for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
	}

}
