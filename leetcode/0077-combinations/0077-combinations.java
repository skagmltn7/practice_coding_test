import java.util.*;
class Solution {

    List<List<Integer>> ans;

    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        dfs(1,new ArrayList<Integer>(), n, k);
        return ans;
    } // end of combine

    public void dfs(int start, List<Integer> combi, int n, int k){
        if(k==0){
            ans.add(new ArrayList<>(combi));
            return;
        }
        for(int nxt = start; nxt <= n; nxt++){
            combi.add(nxt);
            dfs(nxt+1, combi, n,k-1);
            combi.removeLast();
        }
    }
} // end of Solution