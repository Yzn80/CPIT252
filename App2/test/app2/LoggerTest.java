
package app2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yazen
 */
public class LoggerTest {
    
  

    @Test
    public void testSomeMethod() {
         {
    Logger log1 = Logger.getLogger();
    Logger log2 = Logger.getLogger();
    assertEquals(log1, log2);
  }

}
    }
    

