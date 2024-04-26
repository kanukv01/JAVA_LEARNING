package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

 class User {
    String username;
   String password;
   public User(String username, String password) {
       this.username = username;
       this.password = password;
   }

}

public class predicateExample4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username:");
        String username=scan.nextLine();
        System.out.println("Enter password:");
        String password=scan.nextLine();
         User user=new User(username, password);
       Predicate<User> p=User->User.username.equals("vinay") && User.password.equals("vinayvina");
       System.out.println(p.test(user));
    }
}
