import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class TelegramProfileTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkLenght() {
        TelegramProfile teleg[] = new TelegramProfile[3];

        teleg[0] = new TelegramProfile("@WW","0982135331","Vanya");
        teleg[1] = new TelegramProfile();
        teleg[2] = new TelegramProfile("@EE","0974745331","Sanya");

        for (int i = 0; i < teleg.length;i++){
            try {
                teleg[i].checkLenght();
            }catch (NullPointerException e){
                System.err.println("Null pointer there!");
            }
        }
    }

    @Test
    public void usedUsername() {
        TelegramProfile teleg[] = new TelegramProfile[3];

        teleg[0] = new TelegramProfile("@WW","0982135331","Vanya");
        teleg[1] = new TelegramProfile();
        teleg[2] = new TelegramProfile("@EE","0974745331","Sanya");

        for (int i = 0; i < teleg.length;i++){
            try {
                teleg[i].UsedUsername("@WW");
            }catch (NullPointerException e){
                System.err.println("Null pointer there!");
            }
        }
    }
}