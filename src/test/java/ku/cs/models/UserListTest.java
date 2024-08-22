package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Agent1", "679ABC");
        userList.addUser("Agent2", "King5t");
        userList.addUser("Agent3", "Eggggg666");
        // TODO: find one of them
        User user = userList.findUserByUsername("Agent1");
        // TODO: assert that UserList found User
        String expected = "Agent1";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Agent1", "679ABC");
        userList.addUser("Agent2", "King5t");
        userList.addUser("Agent3", "Eggggg666");
        // TODO: change password of one user
        boolean actual = userList.changePassword("Agent3", "Eggggg666", "Queen4Y");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Agent1", "679ABC");
        userList.addUser("Agent2", "King5t");
        userList.addUser("Agent3", "Eggggg666");
        // TODO: call login() with correct username and password
        User user = userList.login("Agent1", "679ABC");
        String expected = user.getUsername();
        String actual = "Agent1";
        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Agent1", "679ABC");
        userList.addUser("Agent2", "King5t");
        userList.addUser("Agent3", "Eggggg666");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Agent1", "678ABC");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}