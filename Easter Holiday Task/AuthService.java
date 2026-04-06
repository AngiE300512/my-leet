import java.util.ArrayList;
class AuthService{
ArrayList<User>u=new ArrayList<>();
AuthService(){
u.add(new User("admin","123","ADMIN"));
u.add(new User("staff","456","STAFF"));
}
User auth(String n,String p){
for(User x:u)
  if(x.user.equals(n) && x.pass.equals(p))
    return x;
return null;
}
}
