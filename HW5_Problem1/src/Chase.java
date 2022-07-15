import javax.crypto.Cipher;
import javax.crypto.SecretKey;;
public class Chase implements Runnable {
	  Box boxAC;
	  int length;
	  SecretKey keyAC;
	  Chase(Box boxAC, int length, SecretKey keyAC) {
	    this.boxAC = boxAC;
	    this.length = length;
	    this.keyAC = keyAC;
	    new Thread(this).start();
	   
	  }
	  @Override
	  public void run() {
		  try {
			  for(int i=0; i< length; i++) {
				  byte[] ciphertext = boxAC.get(); 
				  String encrypted_message = new String(ciphertext);
				  Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); 
				  byte[] normaltext = Encryption.decrypt(ciphertext, aesCipher, keyAC);
				  String decrypted_message = new String(normaltext);
				 
				  System.out.println("\n************************************");
				  System.out.print("\nChase Encrypted Message: " + encrypted_message + "\nChase Decrypted Message:" + decrypted_message);
				  
			  }
		  }catch(Exception e) {
			  e.printStackTrace();
	
		  }
	 }
}
