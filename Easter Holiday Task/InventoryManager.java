import java.util.ArrayList;
class InventoryManager{
ArrayList<Product>p=new ArrayList<>();
ArrayList<Transaction>t=new ArrayList<>();
ArrayList<Supplier>s=new ArrayList<>();
void addP(Product x){
  p.add(x);
}
void addT(Transaction x){
  t.add(x);
}
void addS(Supplier x){
  s.add(x);
}
Product find(String id){
for(Product x:p)
  if(x.id.equals(id))
    return x;
return null;
}
void log(){
  for(Transaction x:t)
    x.show();
}
void stock(){
  for(Product x:p)
    x.show();
}
}
