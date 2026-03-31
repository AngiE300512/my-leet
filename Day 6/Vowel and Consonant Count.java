import java.util.Scanner;
class Main{
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int v=0;
        int c=0;
        for(int ind=0;ind<str.length();ind++){
            char ch=str.charAt(ind);
            if(ch>='a' && ch<='z' ){
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u')
                v++;
                else
                c++;
            }
        }
        System.out.print("Vowels: "+v+"\nConsonants: "+c);
    }
}
