package hotel;
public class Room{
 int roomNo;
 String propertyType;
 double price;
 double distance;
 boolean hasBreakfast;
 String guestName=null;
 String phone=null;
 public Room(int roomNo,String propertyType,double price,double distance,boolean hasBreakfast){
  this.roomNo=roomNo;
  this.propertyType=propertyType;
  this.price=price;
  this.distance=distance;
  this.hasBreakfast=hasBreakfast;
 }
 @Override
 public String toString(){
  return "Room "+roomNo+" ["+propertyType+"] - $"+price+" | "+distance+"km from center";
 }
}
