package BOJ;
import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int limit = Integer.valueOf(br.readLine());
		int speed = Integer.valueOf(br.readLine());
		
		int diff = speed - limit;
		int fine = 0;
		if(diff<=0) {
			System.out.println("Congratulations, you are within the speed limit!");
		}else {
			if(diff < 21){
				fine = 100;
			}else if(diff < 31) {
				fine = 270;
			}else {
				fine = 500;
			}
			System.out.printf("You are speeding and your fine is $%d.\n",fine);
		}
		
	}
}
