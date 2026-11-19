package Day_3;
import java.util.HashMap;
import java.util.Map;


public class LoginService {
    Map<String ,String> map=new HashMap<>();
    
    public LoginService(){
        map.put("Walter white","Heisenberg");
        map.put("Jesse Pinkman","Capn Cook");
        map.put("Gus Fring","The Chicken Man");
        map.put("Saul Goodman","Jimmy McGill");
        map.put("Hank Schrader","ASAC Schrader");
    }
    public boolean validate(String username, String password){
        if(map.containsKey(username)){
            String realPassword = map.get(username);
            if(realPassword.equals(password)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
