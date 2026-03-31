class Solution {
    public int[] twoSum(int[] nums, int target) {
        int b[]=new int[2];
       for(int i=0;i<nums.length()-2;i++){
        int n=nums[i];
        for(int j=i+1;j<nums.length()-1;j++){
            if(n+nums[j]==target){
                b[]={i,j};
            }
        }
        
       } 
    }
}
