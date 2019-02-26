import java.util.*;

public class App{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your sentence");
    char[] userSentence = input.nextLine().toLowerCase().toCharArray();
    System.out.println("Enter the number of letters to shift by");
    int userShift = input.nextInt();

    char[] userEncrypted = new char[userSentence.length];
    CaesarCipher cipher = new CaesarCipher(userSentence,userShift);
  }
}
