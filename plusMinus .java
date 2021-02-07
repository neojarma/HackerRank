import java.util.Scanner;

public class plusMinus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int [] array = new int [n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		plusMinus(array);
		
	}
	
    static void plusMinus(int[] arr) {
        int netral=0, positif=0, negatif=0;
		for(int i=0; i<arr.length; i++){
		    if(arr[i] == 0){
		        netral++;
		    }else if(arr[i] > 0){
		        positif++;
		    }else if(arr[i] < 0){
		        negatif++;
		    }
		}

		double rationetral = netral / (double) arr.length;
		double ratiopositif = positif /( double) arr.length;
		double rationegatif = negatif / (double) arr.length;
		
		System.out.println(ratiopositif);
		System.out.println(rationegatif);
		System.out.println(rationetral);
    }
}
