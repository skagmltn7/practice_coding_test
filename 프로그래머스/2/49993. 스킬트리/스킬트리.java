import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        char[] _skill = skill.toCharArray();
        int answer = 0;
        for(String skill_tree:skill_trees){
            boolean chk = true;
            int inx = skill_tree.indexOf(_skill[0]);
            // System.out.println(inx);
            for(int i=1;i<_skill.length;i++){
                int nxt = skill_tree.indexOf(_skill[i]);
                if((nxt!=-1 && inx==-1) || (nxt!=-1&&nxt<inx)){
                    chk = false;
                    break;
                }
                inx = nxt;
            }
            if(chk){
                answer++;
            }
        }
        return answer;
    }
}