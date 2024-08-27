package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class StudentListTest {

    StudentList list;

    @BeforeEach
    void init(){
        list = new StudentList();
        list.addNewStudent("6610001", "Bob");
    }

    @Test
    @DisplayName("ทดสอบ add new student")
    void testAddNewStudent(){
//        list.addNewStudent("6610001", "Bob");
        assertEquals(1, list.getStudents().size());
        list.addNewStudent("6610002", "Blob", 50);
        assertEquals(2, list.getStudents().size());
    }

    @Test
    @DisplayName("ทดสอบ find student by id")
    void testFindStudentById(){
//        list.addNewStudent("6610001", "Bob");
        assertEquals("Bob", list.findStudentById("6610001").getName());
    }

    @Test
    @DisplayName("ทดสอบ give score to id")
    void testGiveScoreToId(){
//        list.addNewStudent("6610001", "Bob");
        assertEquals(0, list.findStudentById("6610001").getScore());
        list.giveScoreToId("6610001", 98);
        assertEquals(98, list.findStudentById("6610001").getScore());
    }

    @Test
    @DisplayName("ทดสอบ view grade of id")
    void testViewGradeOfId(){
        list.giveScoreToId("6610001", 98);
        assertEquals("A", list.findStudentById("6610001").grade());
    }

    @Test
    @DisplayName("ทดสอบ get students")
    void testGetStudents(){
        assertEquals(1, list.getStudents().size());
    }
}
