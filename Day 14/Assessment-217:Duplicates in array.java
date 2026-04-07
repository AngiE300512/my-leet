/*use hashset time and space complexity is O(n)
only print true if there are duplicates in array 
i/p = 1,2,3,4 o/p =false
i/p = 1,2,3,4,1 o/p =true
*/
import java.util.HashSet;

public class Main{
    public static void main(String[]args){
        int []nums={1,2,3,1,4,2};
        HashSet<Integer> set=new HashSet<>();
        boolean flag=false;
        for(int x:nums){
            if(!set.add(x)){ 
                flag=true;
                break;
            }}
        System.out.println(flag);
    }}
