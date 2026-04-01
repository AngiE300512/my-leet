/*Given an array of integers, find all the leaders in the array.
  An element is called a leader if it is greater than all elements to its right.
  The last element is always a leader.
  i/p: 16, 17, 4, 3, 5, 2  o/p: 17, 5, 2
  Constraints:
  Time complexity:O(n)
  Space complexity:O(1)
  */


//Shifting my leader to the end 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-count;i++){
            boolean isLeader=true;
            for(int j=i+1;j<n-count;j++){
                if(arr[i]<=arr[j]){isLeader=false;break;}
            }
            if(isLeader){
                int temp=arr[i];
                for(int k=i;k<n-count-1;k++) arr[k]=arr[k+1];
                arr[n-count-1]=temp;
                count++;
                i--;
            }
        }
        
        for(int i=n-count;i<n;i++)System.out.print(arr[i]+" ");
    }
}
