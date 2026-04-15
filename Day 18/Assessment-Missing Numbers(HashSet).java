import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();
        HashSet<Integer> c=new HashSet<>();

        for(int i=0;i<n;i++)
        a.add(sc.nextInt());
        for(int i=0;i<n-1;i++)
        b.add(sc.nextInt());
        for(int i=0;i<n-2;i++)
        c.add(sc.nextInt());

        for(int x:a){
            if(!b.contains(x)) System.out.println("Missing in B: "+x);
        }

        List<Integer> mc=new ArrayList<>();
        for(int x:a){
            if(!c.contains(x)) mc.add(x);
        }
        System.out.println("Missing in C: "+mc.get(0)+" and "+mc.get(1));
    }
}
