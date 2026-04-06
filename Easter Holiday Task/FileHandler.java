import java.io.*;
import java.util.ArrayList;
class FileHandler{
static void save(ArrayList<Product>list){
try(PrintWriter w=new PrintWriter(new FileWriter("data.txt")))
{
for(Product p:list)
  w.println(p.id+","+p.name+","+p.qty);
}
  catch(Exception e){
    System.out.println("Err");
  }
}
}
