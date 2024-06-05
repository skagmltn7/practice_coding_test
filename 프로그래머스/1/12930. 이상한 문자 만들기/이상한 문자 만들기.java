import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder ans = new StringBuilder(s);
        int inx = 0;
        for(int i=0; i<ans.length();i++){
            if(ans.charAt(i)==' '){
                inx = 0;
                continue;
            }
            if(inx%2!=0){
                ans.setCharAt(i,Character.toLowerCase(ans.charAt(i)));
            }else{
                ans.setCharAt(i,Character.toUpperCase(ans.charAt(i)));
            }
            inx++;
        }
        return ans.toString();
    }
}