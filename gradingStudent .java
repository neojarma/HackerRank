import java.util.Scanner;

public class gradingStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int [] array = new int [n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		grading(array);
		
	}
	
	static void grading(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] >= 38) {
				if(array[i] % 10 == 3) {
					array[i] += 2;
				}else if(array[i] ==  40) {
					continue;
				}
				else if(array[i] % 10 == 8 ) {
					array[i] += 2;
				}else if(array[i] % 10 == 0) {
					continue;
				}else if(array[i] % 10 == 4) {
					array[i] += 1;
				}else if(array[i] % 10 == 9) {
					array[i] += 1;
				}	
				else{
					continue;
			}
		}		
	}
		for(int show : array) {
			System.out.println(show);
		}
	}
}
