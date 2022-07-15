import javax.crypto.Cipher;
import javax.crypto.SecretKey;;
public class Bob implements Runnable {
	  Box boxAB;
	  int length;
	  SecretKey keyAB;
	  Bob(Box boxAB, int length, SecretKey keyAB) {
	    this.boxAB = boxAB;
	    this.length = length;
	    this.keyAB = keyAB;
	    new Thread(this).start();
	   
	  }
	  @Override
	  public void run() {
		  try {
			  for(int i=0; i< length; i++) {
				  byte[] ciphertext = boxAB.get(); 
				  String encrypted_message = new String(ciphertext);
				  Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); 
				  byte[] normaltext = Encryption.decrypt(ciphertext, aesCipher, keyAB);
				  String decrypted_message = new String(normaltext);
				 
				  System.out.println("\n************************************");
				  System.out.print("\nBob Encrypted Message: " + encrypted_message + "\nBob Decrypted Message:" + decrypted_message);
				  
			  }
		  }catch(Exception e) {
			  e.printStackTrace();
	
		  }
	 }
}


