import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void checkLessThanOne(){
        assertEquals(0, Main.fibonacci(0));
    }

    @Test
    void checkMoreThanOne(){
        assertEquals(6, Main.fibonacci(5));
    }

}
