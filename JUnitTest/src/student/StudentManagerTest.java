package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	
	StudentManager studentManager;

	@BeforeEach
	void setUp() throws Exception {
		studentManager = new StudentManager();
	}

	@Test
	void testAddStudent() {
		studentManager.addStudent("박준영");
		
		assertTrue(studentManager.hasStudent("박준영"));
	}

	@Test
	void testRemoveStudent() {
		studentManager.addStudent("박준영");
		studentManager.removeStudent("박준영");
		
		assertFalse(studentManager.hasStudent("박준영"));
	}

	@Test
	void testAddDuplicatedStudent() {
		studentManager.addStudent("박준영");
		assertThrows(IllegalArgumentException.class, 
				() -> studentManager.addStudent("박준영"));
	}

	@Test
	void testRemoveAbsentStudent() {
		assertThrows(IllegalArgumentException.class, 
				() -> studentManager.removeStudent("박준영"));
	}

}
