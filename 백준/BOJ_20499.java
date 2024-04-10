pakcage BOJ;
import java.io.*;
import java.util.*;

public class BOJ_20499 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> kda = new ArrayList<>();
		for(String score:br.readLine().split("/")) {
			kda.add(Integer.valueOf(score));
		}
		if(kda.get(0)+kda.get(2) < kda.get(1) || kda.get(1)==0)
			System.out.println("hasu");
		else System.out.println("gosu");
	}	
}
