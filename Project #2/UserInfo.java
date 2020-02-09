public class UserInfo {
  private String un;
  private String enPass;
  
  public UserInfo (String un, String pass) {
    un = un;
    enPass = encrypt(pass);
  }
  
  public void setUsername (String str) {
    un = str;
  }
  
  public String getUsername () {
    return un;
  }
  
  public void setPassword(String newPass) {
    enPass = encrypt(newPass);
  }
  
  public String getPassword () {
    return enPass;
  }
  
  public String removeWhitespaceAndConvertToUpper(String str) {
    return str.trim().toUpperCase();
  }
  
  public String substitute (String str) {
    String temp = "";
    char[] arr = str.toCharArray();
    for(char e : arr) {
      if(e == 'A') temp = temp + '@';
      else if(e == 'E') temp = temp + '=';
      else if(e == 'I') temp = temp + '!';
      else if(e == 'J') temp = temp + '?';
      else if(e == 'O') temp = temp + '*';
      else if(e == 'P') temp = temp + '#';
      else if(e == 'R') temp = temp + '&';
      else if(e == 'S') temp = temp + '$';
      else if(e == 'T') temp = temp + '+';
      else if(e == 'V') temp = temp + '^';
      else if(e == 'X') temp = temp + '%';
      else if(e == ' ') temp = temp + '_';
      else temp = temp + e;
    }
    return temp;
  }
  
  public String swapHalfsforEncrypt (String str) {
    double length = str.length()/2;
    int even = (int) length;
    int odd = (int) (length + 1.5);
    if(str.length() % 2 == 1) return str.substring(odd, str.length()) + str.substring(0, odd);
    else return str.substring(even, str.length()) + str.substring(0, even);
  }
  
  public String swapFirst2WithLast2 (String str) {
    String tempstr = "";
    char[] arr = str.toCharArray();
    char[] temp = {arr[0], arr[1]};
    arr[0] = arr[arr.length - 2];
    arr[1] = arr[arr.length - 1];
    arr[arr.length - 2] = temp[0];
    arr[arr.length - 1] = temp[1];
    for(char e : arr) tempstr = tempstr + e;
    return tempstr;
  }
  
  public String swapMiddleChars (String str) {
    double length = str.length()/2;
    int even = (int) length - 1;
    int odd = (int) (length + 0.5);
    char[] arr = str.toCharArray();
    String tempstr = "";
    
    if(str.length() % 2 == 1) {
      char[] temp = {arr[odd - 1], arr[odd]};
      arr[odd - 1] = arr[odd + 1];
      arr[odd] = arr[odd + 2];
      arr[odd + 1] = temp[0];
      arr[odd + 2] = temp[1];
      for(char e : arr) tempstr = tempstr + e;
      return tempstr;
    }
    else {
      char[] temp = {arr[even - 1], arr[even]};
      System.out.println(arr[even-1]);
      arr[even - 1] = arr[even + 1];
      arr[even] = arr[even + 2];
      arr[even + 1] = temp[0];
      arr[even + 2] = temp[1];
      for(char e : arr) tempstr = tempstr + e;
      return tempstr;
    }
  }
  
  public String encrypt (String str) {
    return swapMiddleChars(swapFirst2WithLast2(swapHalfsforEncrypt(substitute(removeWhitespaceAndConvertToUpper(str)))));
  }
}
