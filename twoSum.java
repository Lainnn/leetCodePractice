class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++){
            int current = nums[i];
            for ( int j = i+1; j < nums.length; j++){
                int addup = nums[j];
                if (current + addup == target){
                    sum[0] = i;
                    sum[1] = ;
                }
            }
        }
        return sum;
    }
}