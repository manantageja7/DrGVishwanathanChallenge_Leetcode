class Solution {
    public int removeDuplicates(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[sum]){
                sum++;
                nums[sum]=nums[i];
            }
        }
        return sum+1;
    }
}