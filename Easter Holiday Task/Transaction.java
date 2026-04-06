import java.util.Date;
class Transaction{
String pid,type;
int qty;
Date d;
Transaction(String p,String t,int q){
pid=p;
type=t;
qty=q;
d=new Date();
}
void show(){
  System.out.println(d+"|"+pid+"|"+type+"|"+qty);
}
}
