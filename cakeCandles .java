
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cakeCandles {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int max = 0;
        int sum = 0;
        int num;
        for(int i =0; i < n; i++){
            num = in.nextInt();
            if(num > max){
                sum = 1;
                max = num;
            }else if(num == max){
                sum++;
            }
        }
        System.out.println(sum);
    }
}