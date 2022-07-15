public class Box {
  byte[] ciphertext;
  boolean valueSet = false;

  synchronized byte[] get() {
    while(!valueSet)
      try {
        wait();
        Thread.sleep(1000);
      } catch(InterruptedException e) {
  
      }
      valueSet = false;
      notify();
      try {
          wait();
          Thread.sleep(1000);
        } catch(InterruptedException e) {
    
        }
      return ciphertext;
  }

  synchronized void put(byte[] ciphertext) {
    while(valueSet)
      try {
    	  wait();
    	  Thread.sleep(1000);
      } catch(InterruptedException e) {
      }

      this.ciphertext = ciphertext;
      valueSet = true;
      notify();
      try {
          wait();
          Thread.sleep(1000);
        } catch(InterruptedException e) {
    
        }
  }
}
