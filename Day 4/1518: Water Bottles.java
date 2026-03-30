class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tot=numBottles;
        while(numBottles>=numExchange){
            int newB=numBottles/numExchange;
            numBottles=newB+(numBottles%numExchange);
            tot+=newB;
        }
        return tot;
    }
}
