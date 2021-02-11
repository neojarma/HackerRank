import java.util.Scanner;

public class breakingTheRecords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		int n = input.nextInt();
		int[] array = new int [n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		calculate(array);
	}
	
	static void calculate(int [] array) {
		int min=array[0], max=array[0];
		int resultMin=0, resultMax=0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(max < array[j]) {
					max = array[j];
					resultMax++;
				}else if(min > array[j]) {
					min = array[j];
					resultMin++;
				}
			}
		}
		
		System.out.println(resultMax);
		System.out.println(resultMin);
	}
}