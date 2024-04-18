import org.example.ADDint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class addint {
    @Test
    public void add(){
        ADDint obj = new ADDint();
        Assertions.assertEquals(4, obj.add(2,2));
    }
    }
