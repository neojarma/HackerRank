import java.util.Scanner;

public class appleAndOrange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int startHouse, endHouse, applePosition, orangePosition, banyakApple, banyakOrange;

		
		startHouse = input.nextInt();
		endHouse = input.nextInt();
		applePosition = input.nextInt();
		orangePosition = input.nextInt();
		banyakApple = input.nextInt();
		banyakOrange = input.nextInt();
		
		int [] apple = new int [banyakApple];
		int [] orange = new int [banyakOrange];
			
		for (int i = 0; i < apple.length; i++) {
			apple[i] = input.nextInt();
		}
		
		for (int i = 0; i < orange.length; i++) {
			orange[i] = input.nextInt();
		}
		
		calculate(startHouse, endHouse, applePosition, orangePosition, apple, orange);
		
	}
	
	static void calculate(int startHouse, int endHouse, int applePosition, int orangePosition, int [] apple, int [] orange) {
		int countApple=0, countOrange=0;
		
		//menjumlahkan isi array dengan masing-masing posisi pohon nya
		for (int i = 0; i < apple.length; i++) {
			apple[i] += applePosition;
		}
		for (int i = 0; i < orange.length; i++) {
			orange[i] += orangePosition;
		}
		
		//itung apel
		for (int i = 0; i < apple.length; i++) {
			if(apple[i] >= startHouse && apple[i] <= endHouse) {
				countApple++;
			}
		}
		
		//itung orange
		for (int i = 0; i < orange.length; i++) {
			if(orange[i] >= startHouse && orange[i] <= endHouse) {
				countOrange++;
			}
		}
		
		System.out.println(countApple);
		System.out.println(countOrange);
		
	}
	
	
}