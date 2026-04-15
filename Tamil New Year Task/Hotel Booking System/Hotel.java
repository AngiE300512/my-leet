package hotel;
import java.util.*;
public class Hotel{
Map<Integer,Room>rooms=new HashMap<>();
List<Integer>lastSearchResults=new ArrayList<>();
public void addRoom(Room r){
    rooms.put(r.roomNo,r);
    }
public void search(String type,double budget,double dist,boolean bf){
 lastSearchResults.clear();
 System.out.println("\nAvailable Properties");
 for(Room r:rooms.values()){
  if(r.propertyType.equalsIgnoreCase(type)&&r.price<=budget&&r.distance<=dist&&(!bf||r.hasBreakfast)&&r.guestName==null){
   System.out.println(r);
   lastSearchResults.add(r.roomNo);
  }
 }
 if(lastSearchResults.isEmpty())
 System.out.println("No properties found matching your filters.");
}
public void book(int roomNo,String name,String phone,String in,String out){
 if(!lastSearchResults.contains(roomNo)){
  System.out.println("Error: Please choose a Room Number from the list above!");
  return;
 }
 Room r=rooms.get(roomNo);
 r.guestName=name;
 r.phone=phone;
 System.out.println("\nBooking Confirmed for "+name+" (Ph: "+phone+")");
 System.out.println("Stay: "+in+" to "+out);
}
}
