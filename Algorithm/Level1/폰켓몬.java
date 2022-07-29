import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        
        int resultLength = nums.length / 2;
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(!ar.contains(nums[i])){
                ar.add(nums[i]);
            }
        }
        
        if(ar.size() >= resultLength) {
            return resultLength;
        } else{
            return ar.size();
        }

    }
}
