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

  public char[] getUserPlain(){
    return userPlainInput;
  }

  public int getUserKey(){
    return userKey;
  }
}
