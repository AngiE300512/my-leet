class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        for(int ind=0;ind<nums.length;ind++){
            if(nums[ind]%6==0){
                sum+=nums[ind];
                count++;
            }
        }
        return sum==0?0:sum/count;
    }
}
