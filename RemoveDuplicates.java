import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList <Integer> sorted = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!sorted.contains(nums[i]))
            sorted.add(nums[i]);
        }        
        int[] newList = new int[sorted.size()];
        for(int j = 0; j < sorted.size();j++){
            newList[j] = sorted.get(j);
        }
        for(int i = 0 ; i < newList.length; i++){
            nums[i] = newList[i];
        }
        nums = Arrays.copyOf(nums, newList.length);
        return nums.length;
    }       
}