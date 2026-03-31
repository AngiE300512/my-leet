import java.util.Scanner;
class Main{
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int alpha=0;
        int digit=0;
        int special=0;
        for(int ind=0;ind<str.length();ind++){
            char ch=str.charAt(ind);
            if(ch>='a' && ch<='z' || ch<='A' && ch=='Z'){
                alpha++;
            }
            else if(ch>='0' && ch<='9')
            digit++;
            else
            special++;
        }
        System.out.print("Alphabets: "+alpha+"\nDigits: "+digit+"\n Special Characters: "+special);
    }
}
