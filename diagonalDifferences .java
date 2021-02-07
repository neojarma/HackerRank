//mencari selisih antara penjumlahan
//diagonal kanan - kiri
public class diagonalDifferences {
	public static void main(String[] args) {
		int a[][] = {
				{11, 2, 4},
				{4, 5, 6},
				{10, 8, -12},
				};
		System.out.println(selisihSumDiagonal(a));
	}
	
	static int selisihSumDiagonal(int a[][]) {
		int selisih=0;
		int hasilKanan =0, hasilKiri=0;
		
		for (int i = 0; i < a.length; i++) {
			hasilKanan += a[i][i];
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j>=0; j--) {
				hasilKiri += a[i][j];
				i+=1;
			}
		}
		
		selisih = hasilKanan - hasilKiri;
		//nilai absolut
		return Math.abs(selisih);
	}
}