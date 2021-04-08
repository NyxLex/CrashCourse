import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DogTest {

    @Before
    public void setUp() throws Exception {
        List<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("Barsik", "Akita",7));
        list.add(new Dog("Musya", "Auggie",5));
        list.add(new Dog("Wilgard", "Labrador",6));
      //  list.add(new Dog("Wilgard", "Labrador",-2));
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void getAge() {
        Dog first = new Dog("Dasha", "Akita",12);
        first.getAge();
    }

    @Test
    public void setAge() {
        Dog first = new Dog("Dasha", "Akita",12);
        first.setAge(4);
    }

    @Test
    public void main() {
    }
}