/* UserInfoDriver.java     Author: Ethan Jhong *
 * 
 * A program that takes in a name, address,    *
 * username and password. It uses the UserInfo *
 * file to exncrypt the password.              */

import java.util.*;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class UserInfoDriver {
    public static void main(String[] args) {
      
      //Creates two new array lists to store usernames(to make sure there ae no repeat usernames) and to store the entire UserInfo
      List<String> names = new ArrayList<String>();
      List<UserInfo> users = new ArrayList<UserInfo>();
      
      //Creates a loop boolean to loop the program
      boolean loop = true;
      while(loop == true) {
        
        //Creates new loops and sets the loop to false to allow the user to choose to repeat the program
        loop = false;
        boolean chosen = false;
        boolean bool = true;
        
        //Creates the un and address variables for later use
        String un = "";
        String address = "";
        
        //Allows the user to input a name and makes sure it is not empty or less than 1 character
        String name = JOptionPane.showInputDialog(null, "Please enter your name below.", "User Info", JOptionPane.QUESTION_MESSAGE);
        if(name == null) bool = false;
        else if(name.length() < 1) {
          JOptionPane.showMessageDialog(null, "You haven't entered a name!");
          bool = false; 
        } 
        //Allows the user to input an address and makes sure it is not empty or less than 1 character
        if(bool == true) {
          address = JOptionPane.showInputDialog(null, "Please enter your address below.", "User Info", JOptionPane.QUESTION_MESSAGE);
          if(address == null) bool = false;
          else if(address.length() < 1) {
            JOptionPane.showMessageDialog(null, "You haven't entered an address!");
            bool = false; 
          }
        }
        //Allows the user to input a username and makes sure it is not empty or less than 1 character
        if(bool == true) {
          un = JOptionPane.showInputDialog(null, "Please enter a username below.", "User Info", JOptionPane.QUESTION_MESSAGE);
          if(un == null) bool = false;
          if(un.length() < 1) {
            JOptionPane.showMessageDialog(null, "You haven't entered a username!");
            bool = false; 
          }
        }
        if(bool == true) {
          for(int i = 0; i < names.size(); i ++) {
            if(names.get(i).equals(un)) {
              JOptionPane.showMessageDialog(null, "Another user has already chosen that username!", "User Info", JOptionPane.ERROR_MESSAGE);
              loop = true;
              chosen = true;
            }
          }
          
          //Allows the user to input a password and makes sure it is not empty or less than 1 character. Also adds the username to the name array
          if(chosen == false) {
            names.add(un);
            String pass = JOptionPane.showInputDialog(null, "Please enter a password below.", "User Info", JOptionPane.QUESTION_MESSAGE);
            if(pass.length() < 4) JOptionPane.showMessageDialog(null, "Enter a longer password", "User Info", JOptionPane.ERROR_MESSAGE);
            else {
            JOptionPane.showMessageDialog(null, "Username: " + un + "\nPassword: " + pass, "User Info", JOptionPane.INFORMATION_MESSAGE);
            users.add(new UserInfo(name, address, un, pass));
            }
            //Sets the password to nothing so it is not stored
            pass = "";
          }
        }
        //Allows the user to loop the program
        if(JOptionPane.showConfirmDialog(null, "Would you like to register a new user?", "User Info", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) loop = true;
      }
    }
}
