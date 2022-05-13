import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p;
    @BeforeEach
    void setUp() {
        p = new Person();
    }

    @Test
    void setDni() {
    }

    @Test
    void setMail() {
        p.setMail("gherwnjerigjfwd");
        assertEquals("",p.getMail());
    }
}