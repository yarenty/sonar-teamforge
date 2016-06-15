package com.collabnet.ce.webservices;

import java.util.LinkedList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CTFObjectTest</code> contains tests for the class <code>{@link CTFObject}</code>.
 *
 * @generatedBy CodePro at 12/03/14 18:02
 * @author yarenty
 * @version $Revision: 1.0 $
 */
public class CTFObjectTest {
	/**
	 * Run the ObjectWithTitle findByTitle(List<T>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testFindByTitle_1()
		throws Exception {
		CTFObject fixture = new CTFFile(new CollabNetApp(""), "");
		List<ObjectWithTitle> list = new LinkedList();
		String title = "";

		ObjectWithTitle result = fixture.findByTitle(list, title);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ObjectWithTitle findByTitle(List<T>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testFindByTitle_2()
		throws Exception {
		CTFObject fixture = new CTFFile(new CollabNetApp(""), "");
		List<ObjectWithTitle> list = new LinkedList();
		String title = "";

		ObjectWithTitle result = fixture.findByTitle(list, title);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ObjectWithTitle findByTitle(List<T>,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testFindByTitle_3()
		throws Exception {
		CTFObject fixture = new CTFFile(new CollabNetApp(""), "");
		List<ObjectWithTitle> list = new LinkedList();
		String title = "";

		ObjectWithTitle result = fixture.findByTitle(list, title);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		CTFObject fixture = new CTFFile(new CollabNetApp(""), "");

		String result = fixture.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CTFObjectTest.class);
	}
}