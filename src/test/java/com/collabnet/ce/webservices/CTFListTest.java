package com.collabnet.ce.webservices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.*;
import org.sonar.api.rule.RuleKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * The class <code>CTFListTest</code> contains tests for the class <code>{@link CTFList}</code>.
 *
 * @generatedBy CodePro at 12/03/14 18:03
 * @author yarenty
 * @version $Revision: 1.0 $
 */
public class CTFListTest {
	/**
	 * Run the CTFList() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testCTFList_1()
		throws Exception {

		CTFList result = new CTFList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CTFList(Collection<? extends T>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testCTFList_2()
		throws Exception {
		Collection<? extends ObjectWithTitle> c = new LinkedList();

		CTFList result = new CTFList(c);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ObjectWithTitle byId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testById_1()
		throws Exception {
		CTFList fixture = new CTFList();

		CTFTracker obj = mock(CTFTracker.class);
		when(obj.getId()).thenReturn("FOO");
		fixture.add(obj);

		String id = "FOO";
		
		ObjectWithTitle result = fixture.byId(id);

		assertNotNull(result);
	}


	/**
	 * Run the ObjectWithTitle byTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testByTitle_1()
		throws Exception {
		CTFList fixture = new CTFList();
		CTFTracker obj = mock(CTFTracker.class);
		when(obj.getTitle()).thenReturn("FOO");
		fixture.add(obj);

		String title = "FOO";

		ObjectWithTitle result = fixture.byTitle(title);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.collabnet.ce.webservices.CTFList.byTitle(CTFList.java:26)
		assertNotNull(result);
	}


	/**
	 * Run the List<String> getTitles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testGetTitles_1()
		throws Exception {
		CTFList fixture = new CTFList();
		fixture.add((Object) null);

		List<String> result = fixture.getTitles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
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
	 * @generatedBy CodePro at 12/03/14 18:03
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
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CTFListTest.class);
	}
}