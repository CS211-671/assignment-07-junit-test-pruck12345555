package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
        studentList.addNewStudent("6655443321","Pig");
        studentList.addNewStudent("6655443312","Cow");
    }

    @Test
    void testFindStudent() {
        assertNotNull(studentList.findStudentById("6655443321"));
        assertNull(studentList.findStudentById("6942077610"));
    }

    @Test
    void testGiveScore(){
        studentList.giveScoreToId("6655443321", 15);
        assertEquals(15, studentList.findStudentById("6655443321").getScore());
    }

    @Test
    void testViewGrade(){
        studentList.giveScoreToId("6655443321", 60);
        assertEquals("C", studentList.viewGradeOfId("6655443321"));
    }

    @Test
    void testGetStudents(){
        ArrayList<Student> studentListClone = studentList.getStudents();
        assertSame(studentListClone, studentList.getStudents());
    }

}