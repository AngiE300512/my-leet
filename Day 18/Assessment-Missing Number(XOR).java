import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        int[] c=new int[n-2];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++) b[i]=sc.nextInt();
        for(int i=0;i<n-2;i++) c[i]=sc.nextInt();

        int xorB=0;
        for(int x:a) xorB^=x;
        for(int x:b) xorB^=x;
        System.out.println("Missing in B: "+xorB);

        int xorC=0;
        for(int x:a) xorC^=x;
        for(int x:c) xorC^=x;
        System.out.println("Missing in C: "+xorC);
    }
}
