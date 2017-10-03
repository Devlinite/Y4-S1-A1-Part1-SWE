package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment1.Student;

public class Part1b {

	@Test
	public void testPart1b() {
		Student testStudent = new Student("David", 20, 12345678);

        String result = testStudent.getUsername();

        assertEquals("David20", result);
	}

}
