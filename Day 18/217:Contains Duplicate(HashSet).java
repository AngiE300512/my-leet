class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>s=new HashSet<>();
        for(int n:nums){

          // if condition checks if element alreeady present in the set 
          //if it is already inside then true
          //if not then false
            if(!s.add(n))return true;
}
return false;
    }
}
