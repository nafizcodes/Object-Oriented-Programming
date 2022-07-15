
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;

public class Encryption
{
	static byte[] encrypt(byte s[], Cipher c, SecretKey sk) throws Exception
	{
	    c.init(Cipher.ENCRYPT_MODE, sk);
	    return c.doFinal(s);
	}

	static byte[] decrypt(byte s[], Cipher c, SecretKey sk) throws Exception
	{
	    c.init(Cipher.DECRYPT_MODE, sk);
	    return c.doFinal(s);
	}
}
