import java.util.*;

class Solution {
    public int solution(int n) {
        int ans = 0;
        List<Integer> tmp = new ArrayList();
        while(n!=0){
            tmp.add(n%3);
            n/=3;
        }
        int inx = 0;
        for(int i = tmp.size()-1;i>=0;i--){
            ans += (int)Math.pow(3,inx++)*tmp.get(i);
        }
        return ans;
    }
}