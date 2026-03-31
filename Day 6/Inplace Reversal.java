import java.util.Scanner;
class Main{
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int l=0;
        int r=str.length()-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        System.out.print(new String(s));
    }
}
