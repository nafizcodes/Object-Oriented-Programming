import javax.crypto.*;;
public class Alice implements Runnable {
	  Box box;
	  String message[];
	  SecretKey key;
	  byte[] ciphertext;
	  Alice(Box box, String message[], SecretKey key) {
	    this.box = box;
	    this.message = message;
	    this.key = key;
	    new Thread(this).start();
	   
	  }
	  @Override
	  public void run() {
		  try {
			  for(int i=0; i< message.length; i++) {
				  Cipher aesCipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); 
				  byte[] cleartext = message[i].getBytes();
				  this.ciphertext = Encryption.encrypt(cleartext, aesCipher, key);
				  String encrypted_message = new String(ciphertext);
				  box.put(ciphertext);
				  System.out.print("\n************************************");
				  System.out.print("\nAlice Messsage: " + message[i] + "\nAlice Encrypted Message: " + encrypted_message);
				  
			  }
		  }catch(Exception e) {
			  e.printStackTrace();
	
		  }
	  }
	}

