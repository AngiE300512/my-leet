// time limit exceeded 
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
          int  sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
            
            if(sum%k==0)
            count+=1;
     } }return count;
    }
}
//remainder method
class Solution{
    public int subarraysDivByK(int[]nums,int k){
        int[]tracker=new int[k];
        tracker[0]=1;
        int totalSum=0;
        int result=0;
        for(int num:nums){
            totalSum+=num;
            int rem=totalSum%k;
            if(rem<0)rem+=k;
            result+=tracker[rem];
            tracker[rem]++;
        }
        return result;
    }
}
