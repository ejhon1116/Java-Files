import java.util.ArrayList;
import javax.swing.JOptionPane;
public class UserInfoDriver {
    public static void main(String[] args) {
        ArrayList<UserInfo> users = new ArrayList<UserInfo>();
        String un = JOptionPane.showInputDialog(null, "Hello user! Please enter a username below.");
        String pass = JOptionPane.showInputDialog(null, "Please enter a password below.");
        users.add(new UserInfo(un, pass));
        System.out.println(users.get(0).toString());
    }
}
