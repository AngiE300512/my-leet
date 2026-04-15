public class MissingNumbers {
    public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        int[] c=new int[n-2];

        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++) b[i]=sc.nextInt();
        for(int i=0;i<n-2;i++) c[i]=sc.nextInt();

        long sa=0,sb=0,sc2=0,ssa=0,ssc=0;
        for(int x:a)
          sa+=x;
        for(int x:b)
          sb+=x;
        for(int x:c) 
        {
          sc2+=x; 
          ssc+=(long)x*x;
        }
        for(int x:a) 
          ssa+=(long)x*x;

        System.out.println("Missing in B: "+(sa-sb));

        long s=sa-sc2;
        long p=(s*s-(ssa-ssc))/2;
        long d=(long)Math.round(Math.sqrt(s*s-4*p));

        System.out.println("Missing in C: "+(s+d)/2+" and "+(s-d)/2);
    }
}
