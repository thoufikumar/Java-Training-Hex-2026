package Day_3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("*****Login Page*****");

    System.out.println("Enter the username");
    String username = sc.next();
    System.out.println("Enter the password");
    String password = sc.next();
    LoginService loginservice = new LoginService();
    boolean result = loginservice.validate(username, password);
    if(result){
        System.out.println("Welcome "+ username);
        System.out.println("You have successfully logged into the system.");
    }
    else{
        System.out.println("Invalid username or password. Please try again.");
        System.out.println("Session terminated , kindly retry with valid credentials.");
    }
    System.out.println("******************");
    sc.close();
}
}
