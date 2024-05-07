import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int num:nums){
            deque.addLast(num);
        }
        for(int i= 0;i<k;i++){
            deque.addFirst(deque.pollLast());
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = deque.pollFirst();
        }
    }
}