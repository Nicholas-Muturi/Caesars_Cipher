public class CaesarCipher {
  private static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  private char[] userPlainInput;
  private int userKey;
  private char[] userEncrypted;
  private char[] userDecrypted;

  public CaesarCipher(char[] userInput, int userNumber){
      userPlainInput = userInput;
      userKey = userNumber;
      userEncrypted = new char[userPlainInput.length];
      userDecrypted = new char[userPlainInput.length];
  }

  public void setEncrypted(){
    for(int i=0; i<userPlainInput.length;i++){
      for(int y=0; y<alphabet.length;y++){
        if(userPlainInput[i] == ' '){
          userEncrypted[i] = ' ';
        }
        else if(userPlainInput[i] == alphabet[y]){
          if(y+userKey >= alphabet.length){
            y = (y-25+0-1);
            userEncrypted[i] = alphabet[y+userKey];
            break;
          }
          else{
            userEncrypted[i] = alphabet[y+userKey];
          }
        }
      }// end inner loop
    }//end outer loop
  }//end function

  public void setDecrypted(){
    for(int i=0; i<userEncrypted.length; i++){
      for(int y=0; y<alphabet.length; y++){
        if(userEncrypted[i] == ' '){
          userDecrypted[i] = ' ';
        }
        else if(userEncrypted[i] == alphabet[y]){
          if(y-userKey < 0){
            y = (y+25-0+1);
            userDecrypted[i] = alphabet[y-userKey];
            break;
          }
          else{
            userDecrypted[i] = alphabet[y-userKey];
          }
        }
      }// end inner loop
    }//end outer loop
  }//end function

  public char[] getUserPlain(){
    return userPlainInput;
  }

  public int getUserKey(){
    return userKey;
  }

  public String getEncrypted(){
    return String.valueOf(userEncrypted);
  }

  public String getDecrypted(){
    return String.valueOf(userDecrypted);
  }

  public void printPlainInput(){
    System.out.println(String.valueOf(userPlainInput));
  }
  public void printEncrypted(){
    System.out.println(String.valueOf(userEncrypted));
  }
  public void printDecrypted(){
    System.out.println(String.valueOf(userDecrypted));
  }

} // end class
