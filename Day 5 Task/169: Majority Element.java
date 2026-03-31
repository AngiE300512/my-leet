class Solution {
    public int majorityElement(int[] nums) {
        int count=0,m=0;
      for(int i : nums){
        if(count==0){
            m=i;
            count=1;
        }else{
            count+= m==i?1:-1;
        }
      }
      return m;  
    }
}
