import java.util.*;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
public class UserInfoDriver {
    public static void main(String[] args) {
      List<String> names = new LinkedList<String>();
      boolean loop = true;
      while(loop == true) {
        loop = false;
        String un = JOptionPane.showInputDialog(null, "Hello user! Please enter a username below.");
        String pass = JOptionPane.showInputDialog(null, "Please enter a password below.");
        for(int i = 0; i < names.size(); i ++) {
          if(names.get(i) == un) {
            JOptionPane.showMessageDialog(null, "Another user has already chosen that username! Please pick another one!");
            loop = true;
          }
          else {
            names.add(un);
            JOptionPane.showMessageDialog(null, "Username: " + un + "\nPassword: " + pass);
            if(JOptionPane.showConfirmDialog(null, "Would you like to register a new user?") == 0) loop = true;
          }
        }
      }
    }
}
