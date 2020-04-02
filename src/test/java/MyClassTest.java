import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @Test
    void returnTrue() {
        MyClass myClass = new MyClass();
        assertTrue(myClass.returnTrue());
    }
}