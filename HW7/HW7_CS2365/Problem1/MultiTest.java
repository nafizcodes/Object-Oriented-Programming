import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class MultiTest{
	public static void main(String args[]) {
		String message_AB = "We have a meeting tomorrow at 8am";
		String message_AC = "Tomorrow meeting will be held in room 100";
		
		String words_AB[] = message_AB.split(" ");
		String words_AC[] = message_AC.split(" ");
		
		Box boxAB = new Box();
		Box boxAC = new Box();
		
		try {
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			SecretKey keyAB = keygen.generateKey();
			SecretKey keyAC = keygen.generateKey();
			
			new Alice(boxAB, words_AB, keyAB);
			new Bob(boxAB, words_AB.length, keyAB);
			
			new Alice(boxAC, words_AC, keyAC);
			new Bob(boxAC, words_AC.length, keyAC);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
