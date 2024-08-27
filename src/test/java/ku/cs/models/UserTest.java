package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void init(){ user = new User("user01", "plain-p@ssw0rd");}

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
//        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
//        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    @DisplayName("ทดสอบ is username")
    void testIsUsername() {
        boolean actual = user.isUsername("user01");
        assertTrue(actual);
    }

    @Test
    @DisplayName("ทดสอบ set password and validation password")
    void testSetPasswordAndValidationPassword() {
        user.setPassword("Semaj");
        boolean actual = user.validatePassword("Semaj");
        assertTrue(actual);
    }

    @Test
    @DisplayName("ทดสอบ get username")
    void testGetUsername() {
        String actual = user.getUsername();
        assertEquals("user01", actual);
    }
}