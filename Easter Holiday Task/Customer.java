class Customer extends Person{
Customer(String i,String n,String c){
  super(i,n,c);
}
void info(){
  System.out.println("CUSTOMER: "+id+"|"+name+"|"+contact);
}
}
