package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	StudentManager manager;

	@BeforeEach
	void setUp() throws Exception {
		manager = new StudentManager();
	}

	@Test
	void testAddStudent() {
		manager.addStudent("김영희");
		assertTrue(manager.hasStudent("김영희"));
		assertThrows(IllegalArgumentException.class,() -> manager.addStudent("김영희") );

	}

	@Test
	void testRemoveStudent() {
		manager.addStudent("박철수");
		manager.removeStudent("박철수");
		assertFalse(manager.hasStudent("박철수"));
		assertThrows(IllegalArgumentException.class, () -> manager.removeStudent("박철수"));
	}


}


