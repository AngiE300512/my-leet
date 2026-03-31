class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        for(int ind=0;ind<position.length;ind++){
            if(position[ind]%2==0) even++;
            else odd++;
        }
        return Math.min(even,odd);
    }
}
