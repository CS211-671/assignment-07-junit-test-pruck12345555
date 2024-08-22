package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;
    @BeforeEach
    void init(){
        s1 = new Student("6xxxxxxxxx", "David",50);
    }

    @Test
    void testAddScore(){
        s1.addScore(10);
        assertEquals(60,s1.getScore());
        s1.addScore(15);
        assertEquals(75,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        s1.addScore(10);
        assertEquals("C",s1.grade());
    }

    @Test
    void testChangeName(){
        s1.changeName("Messi");
        assertEquals("Messi",s1.getName());
    }

    @Test
    void testIsId(){
        boolean idIsTrue;
        idIsTrue = s1.isId("6xxxxxxxxx");
        assertEquals(idIsTrue, true);
    }
}