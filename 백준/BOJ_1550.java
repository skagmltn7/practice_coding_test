import java.io.*;
import java.util.*;

public class BOJ_1550 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		System.out.println(hex2Dec(num));
	}
	static int hex2Dec(String num) {
		int res = 0;
		for(int i=0;i<num.length();i++) {
			char cur = num.charAt(i);
			if(cur>='A') {
				res += Math.pow(16,num.length()-1-i) * (cur-'A'+10);
			}else {
				res += Math.pow(16,num.length()-1-i) * (cur-'0');
			}
		}
		return res;
	}
}
