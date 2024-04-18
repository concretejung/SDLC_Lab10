import org.example.Addstring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class addstring {

    @Test
    public void teststring() {
        Addstring obj = new Addstring();
        Assertions.assertEquals("Helloworld", obj.join());
    }
    // added a comment

}
