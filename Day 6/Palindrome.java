import java.util.Scanner;
class Main{
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean flag=true;
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(str.charAt(l)!=s.charAt(r)){
            flag=false;
            break;
            }
            l++;
            r--;
        }
        if(flag)
        System.out.print("Palindrome");
        else
        System.out.print("Not a Palindrome");
    }
}
