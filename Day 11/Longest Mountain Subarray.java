//Given an integer array arr.
//  A contiguous subarray of length >=3 which is strictly  (increasing) and then strictly (decreasing).
//  If multiple answers exist, return any 1.If no such array exists return [].Must be strictly increasing then strictly decreasing.
//  Equal elements are not allowed.Peak cannot be the 1st or last element of the subarray.
/*
Example 1
Input:
2, 1, 4, 7, 3, 2, 5
Output:
1, 4, 7, 3, 2

Example 2
Input:
1, 2, 3, 4
Output:
[]

Example 3
Input:
5, 4, 3, 2, 1
Output:
[]

Example 4
Input:
1, 3, 2, 4, 6, 5
Output:
4, 6, 5
  */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int start=-1;
        int end=-1;
        int maxlen=0;
        int[] arr={2,1,4,7,3,2,1};
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left=i;
                int right=i;
                while((left>0 && arr[left]>arr[left-1])&&(right<arr.length-1 && arr[right]>arr[right+1])){
                    left--;right++;
            }
                int len=right-left+1;
                if(len>maxlen){
                    maxlen=len;
                    start=left;
                    end=right;
                }
            }
        }
        if(start==-1)System.out.print(new int[0]);
        int l=end-start+1;
        int[] res=new int[l];
        for(int i=0;i<l;i++){
            res[i]=arr[start+i];
        }
        System.out.print(Arrays.toString(res));
	}
}
