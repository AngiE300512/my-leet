class Supplier extends Person{
Supplier(String i,String n,String c){
  super(i,n,c);
}
void info(){
  System.out.println("SUPPLIER: "+id+"|"+name+"|"+contact);
}
}
