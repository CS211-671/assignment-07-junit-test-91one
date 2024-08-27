package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;

    @BeforeEach
    void init(){
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("James", "james-pass");
        userList.addUser("Jane", "jane-pass");
        userList.addUser("Jack", "jack-pass");
        // TODO: find one of them
        User user = userList.findUserByUsername("James");
        // TODO: assert that UserList found User
         String expected = "James";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("James", "james-pass");
        userList.addUser("Jane", "jane-pass");
        userList.addUser("Jack", "jack-pass");
        // TODO: change password of one user
        boolean actual = userList.changePassword("James", "james-pass", "semaj-pass");
        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("James", "james-pass");
        userList.addUser("Jane", "jane-pass");
        userList.addUser("Jack", "jack-pass");
        // TODO: call login() with correct username and password
        User actual = userList.login("James", "james-pass");
        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("James");
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("James", "james-pass");
        userList.addUser("Jane", "jane-pass");
        userList.addUser("Jack", "jack-pass");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Semaj", "james-pass");
        // TODO: assert that the method return null
         assertNull(actual);
    }

}