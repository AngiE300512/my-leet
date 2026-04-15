//Time Complexity O(n)
//Space Complexity O(1)
// Boyer–Moore Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int c=0,v=0;
        for(int n:nums){
            if(v==0)c=n;
            if(n==c)v++;
            else v--;
}
             return c;
    }
}
