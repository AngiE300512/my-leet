import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        int[] c=new int[n-2];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++) b[i]=sc.nextInt();
        for(int i=0;i<n-2;i++) c[i]=sc.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        for(int i=0;i<b.length;i++){
            if(a[i]!=b[i]){
              System.out.println("Missing in B: "+a[i]); 
              break;
            }
        }
        if(a[b.length]!=b[b.length-1]) System.out.println("Missing in B: "+a[b.length]);

        List<Integer> mc=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(a[i]!=c[i]) mc.add(a[i]);
        }
        while(mc.size()<2) mc.add(a[n-mc.size()-1]);
        System.out.println("Missing in C: "+mc.get(0)+" and "+mc.get(1));
    }
}
