package grading;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Add your own test cases group in methods. JUnit will execute all
 * parameterless public-void methods that are annotated with <b>@Test</b>.
 * <p>
 * Execute the test cases by right-clicking on <code>GraderTest.java</code> in
 * the Package Explorer, and choosing "Run As" > "JUnit Test".
 * <p>
 * <a href='http://junit.org/junit4/cookbook.html'>Learn more about JUnit</a>
 * 
 */
public class GraderTest {
	@Test
	public void gradeF() {
		//Testfall 1
		assertEquals(Grader.Grade.F, Grader.grade(0, 0));
		//Testfall 6
		assertEquals(Grader.Grade.F, Grader.grade(19, 40));
		//Testfall 9
		assertEquals(Grader.Grade.F, Grader.grade(19, 55));
	}
	
	@Test
	public void gradeD() {
		//Testfall 2
		assertEquals(Grader.Grade.D, Grader.grade(25, 25));
		//Testfall 7
		assertEquals(Grader.Grade.D, Grader.grade(20, 39));
	}
	
	@Test
	public void gradeC() {
		//Testfall 3
		assertEquals(Grader.Grade.C, Grader.grade(30, 35));
		//Testfall 8
		assertEquals(Grader.Grade.C, Grader.grade(20, 40));
		//Testfall 10
		assertEquals(Grader.Grade.C, Grader.grade(20, 54));
	}
	
	@Test
	public void gradeB() {
		//Testfall 4
		assertEquals(Grader.Grade.B, Grader.grade(35, 45));
		//Testfall 11
		assertEquals(Grader.Grade.B, Grader.grade(20, 55));
		//Testfall 12
		assertEquals(Grader.Grade.B, Grader.grade(29, 60));
	}
	
	@Test
	public void gradeA() {
		//Testfall 5
		assertEquals(Grader.Grade.A, Grader.grade(40, 60));
		//Testfall 13
		assertEquals(Grader.Grade.A, Grader.grade(30, 60));
	}

}
