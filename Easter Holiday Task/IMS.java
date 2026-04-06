import java.util.Scanner;


public class IMS{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
InventoryManager m=new InventoryManager();
AuthService as=new AuthService();
m.addP(new Product("P1","Laptop","Tech",10,1200,3));
m.addS(new Supplier("S1","Global Tech","999-000"));
  
System.out.print("User: ");
  String u=sc.next();
System.out.print("Pass: ");
  String p=sc.next();
  
User active=as.auth(u,p);
if(active==null)return;
while(true){
System.out.println("\n1.Stock 2.Transact 3.Logs 4.Exit");
int ch=sc.nextInt();
if(ch==4){
  FileHandler.save(m.p);
  break;
}
if(ch==1)
  m.stock();
else if(ch==2){
System.out.print("ID: ");
String id=sc.next();
System.out.print("Qty(+/-): ");
int q=sc.nextInt();
Product f=m.find(id);
if(f!=null){
f.update(q);
m.addT(new Transaction(id,q>0?"IN":"OUT",q));
}
}
else if(ch==3)
  m.log();
}
}
}
