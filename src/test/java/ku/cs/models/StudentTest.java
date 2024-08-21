package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("66xxxxx", "gong");
    }

    @Test
    @DisplayName("ทดสอบ add score")
    void teatAddScore(){
//        Student s1 = new Student("61xxxxx", "gong");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบ calculate grade")
    void testCalculateGrade(){
//        Student s1 = new Student("61xxxxx", "gong");
        s1.addScore(60.8);
        assertEquals("C", s1.grade());
    }

    @Test
    @DisplayName("ทดสอบ change name")
    void testChangeName(){
        s1.changeName("Bob");
        assertEquals("Bob", s1.getName());
        s1.changeName("Blob");
        assertEquals("Blob", s1.getName());
    }

    @Test
    @DisplayName("ทดสอบ constructor 2 parameters")
    void testConstructor2p(){
        Student s2 = new Student("6610001", "Bob");
        assertEquals("6610001", s2.getId());
        assertEquals("Bob", s2.getName());
        assertEquals(0, s2.getScore());
    }

    @Test
    @DisplayName("ทดสอบ constructor 3 parameters")
    void testConstructor3p(){
        Student s3 = new Student("6610002", "Blob", 99);
        assertEquals("6610002", s3.getId());
        assertEquals("Blob", s3.getName());
        assertEquals(99, s3.getScore());
    }

    @Test
    @DisplayName("ทดสอบ is id")
    void testIsId(){
        assertEquals("66xxxxx", s1.getId());
    }

    @Test
    @DisplayName("ทดสอบ toString")
    void testToString(){
        assertEquals("{id: '66xxxxx', name: 'gong', score: 0.0}", s1.toString());
    }
}