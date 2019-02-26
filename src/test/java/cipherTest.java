import org.junit.*;
import static org.junit.Assert.*;

public class cipherTest {

  @Test
  public void runCipher_getUserInput_true(){
    CaesarCipher cipher = new CaesarCipher("this is a string".toCharArray(), 3);
    assertEquals(3, cipher.getUserKey());
  }

  @Test
  public void runCipher_getEncrypted_EncryptedData(){
    CaesarCipher cipher = new CaesarCipher("hi".toCharArray(), 2);
    cipher.setEncrypted();
    assertEquals("jk", cipher.getEncrypted());
  }
}
