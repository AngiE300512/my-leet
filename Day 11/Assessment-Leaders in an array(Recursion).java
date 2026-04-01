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
    static int max;
    static void findleaders(int[] arr,int i,int n){
        if(i==n-1){
max=arr[i];
System.out.print(arr[i]+" ");
return;
}
        findleaders(arr,i+1,n);
        if(arr[i]>max){
max=arr[i];
System.out.print(arr[i]+" ");
}}
    public static void main(String[] args) 
{
        int[] arr={16,17,4,3,5,2};
        findleaders(arr,0,arr.length);

}}
