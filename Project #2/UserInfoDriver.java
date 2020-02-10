import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
public class UserInfoDriver {
    public static void main(String[] args) {
      boolean loop = true;
      while(loop == true) {
        loop = false;
        ArrayList<UserInfo> users = new ArrayList<UserInfo>();
        String un = JOptionPane.showInputDialog(null, "Hello user! Please enter a username below.");
        String pass = JOptionPane.showInputDialog(null, "Please enter a password below.");
        for (int i = 0; i < users.size(); i++) {
          System.out.println(users.get(i).getUsername());
          if(users.get(i).getUsername() == un) JOptionPane.showMessageDialog(null, "You suck.");
        }
        users.add(new UserInfo(un, pass));
        if(JOptionPane.showConfirmDialog(null, "Would you like to register a new user?") == 0) loop = true;
      }
    }
}
