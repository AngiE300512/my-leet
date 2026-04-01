/*Given an array of integers, find all the leaders in the array.
  An element is called a leader if it is greater than all elements to its right.
  The last element is always a leader.
  i/p: 16, 17, 4, 3, 5, 2  o/p: 17, 5, 2
  Constraints:
  Time complexity:O(n)
  Space complexity:O(1)
  */

public class Main 
{
    public static void main(String[] args) 
{
        int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        int max=arr[n-1];
        int[] res=new int[n];
        int ptr=0;
        res[ptr++]=max;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                res[ptr++]=max;
            }
        }
        for(int i=ptr-1;i>=0;i--)System.out.print(res[i]+" ");
    }
}
