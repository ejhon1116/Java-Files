public class UserInfo {
  private String un;
  private String pass;
  
  public UserInfo (String un, String pass) {
    un = un;
    pass = "";
  }
  
  public void setUsername (String str) {
    un = str;
  }
  
  public String getUsername (){
    return un;
  }
  
  public String removeWhitespaceAndConvertToUpper(String str) {
    return str.trim().toUpperCase();
  }
  
  public String substitute (String str) {
    String temp = "";
    char[] arr = str.toCharArray();
    for(char e : arr) {
      if(e == 'A') e = '@';
      else if(e == 'E') e = '=';
      else if(e == 'I') e = '!';
      else if(e == 'J') e = '?';
      else if(e == 'O') e = '*';
      else if(e == 'P') e = '#';
      else if(e == 'R') e = '&';
      else if(e == 'S') e = '$';
      else if(e == 'T') e = '+';
      else if(e == 'V') e = '^';
      else if(e == 'X') e = '%';
      else if(e == ' ') e = '_';
    }
    for(char e : arr) temp = temp + e;
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
    char[] arr = str.toCharArray();
    char[] temp = {arr[0], arr[1]};
  }
}
