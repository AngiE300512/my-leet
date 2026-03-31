import java.util.Scanner;
class Main{
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int ind=0;ind<str.length();ind++){
            if(ch[ind]>='a' && ch[ind]<='z' ){
                ch[ind]=(char)(ch[ind]-32);
            }
        }
        System.out.print(new String(ch));
    }
}
