package hotel;
import java.util.Scanner;
public class Main{
 public static void main(String[] args){
  Hotel h=new Hotel();
  Scanner sc=new Scanner(System.in);
  h.addRoom(new Room(101,"Hotel",5000,0.5,true));
  h.addRoom(new Room(201,"Resort",15000,1.2,true));
  h.addRoom(new Room(301,"Villa",25000,3.0,true));
  System.out.println("Booking.com Terminal");
  System.out.print("Where are you going? ");
  String loc=sc.next();
  System.out.print("Check-in (DD/MM): ");
  String in=sc.next();
  System.out.print("Check-out (DD/MM): ");
  String out=sc.next();
  System.out.print("No. of Adults: ");
  int adults=sc.nextInt();
  System.out.print("No. of Children: ");
  int children=sc.nextInt();
  for(int i=1;i<=children;i++){
   System.out.print("Enter age of child "+i+": ");
   int age=sc.nextInt();
   if(age>=18){
    System.out.println("Invalid: Over 18 is an adult. Moving counts.");
    adults++;
    children--;
    i--;
   }
  }
  System.out.println("\nFilters");
  System.out.print("Type: ");
  String type=sc.next();
  System.out.print("Max Budget: ");
  double budget=sc.nextDouble();
  System.out.print("Max Dist: ");
  double dist=sc.nextDouble();
  System.out.print("Breakfast? (true/false): ");
  boolean bf=sc.nextBoolean();
  h.search(type,budget,dist,bf);
  if(!h.lastSearchResults.isEmpty()){
   System.out.print("\nEnter Room No to book: ");
   int rNo=sc.nextInt();
   sc.nextLine();
   System.out.print("Full Name: ");
   String name=sc.nextLine();
   System.out.print("Phone Number: ");
   String ph=sc.next();
   h.book(rNo,name,ph,in,out);
  }
 }
}
