class Solution {
    public int integerReplacement(int num) {
        long n=num;
        int count=0;
        while(n!=1){
            if(n%2==0){
            n=n/2;
            count++;
            }
            else{ 
                if(n%4==1 || n==3)
                    n=n-1;
                else
                    n=n+1;
                count++;
            }
            
        }
        return count;
    }
}
