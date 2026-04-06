class Product extends Item implements Actionable{
Product(String i,String n,String c,int q,double p,int m){
super(i,n,c,q,p,m);
}
public void update(int q){
if(qty+q<0)
  System.out.println("Low Stock!");
else 
  qty+=q;
}
public void show(){
String s=(qty<=min)?" [LOW]":"";
System.out.println(id+"|"+name+"|"+cat+"|Qty:"+qty+"|Price:"+price+s);
}
}
