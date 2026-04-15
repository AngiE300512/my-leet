// Time Limit Exceeded 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int n:nums){
            if(l.contains(n))return true;
            l.add(n);
}
return false;
    }
}
