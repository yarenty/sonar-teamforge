package com.collabnet.ce.webservices;

import java.rmi.RemoteException;
import org.junit.*;
import static org.junit.Assert.*;
import com.collabnet.ce.soap50.webservices.docman.DocumentSoapDO;
import com.collabnet.ce.soap50.webservices.docman.DocumentSoapRow;

/**
 * The class <code>CTFDocumentTest</code> contains tests for the class <code>{@link CTFDocument}</code>.
 *
 * @generatedBy CodePro at 12/03/14 18:02
 * @author yarenty
 * @version $Revision: 1.0 $
 */
public class CTFDocumentTest {
	/**
	 * Run the CTFDocument(CTFObject,DocumentSoapDO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testCTFDocument_1()
		throws Exception {
		CTFObject parent = new CTFFile(new CollabNetApp(""), "");
		DocumentSoapDO data = new DocumentSoapDO();

		CTFDocument result = new CTFDocument(parent, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDescription());
		assertEquals("/sf/go/null", result.getURL());
		assertEquals(null, result.getPath());
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CTFDocument(CTFObject,DocumentSoapRow) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testCTFDocument_2()
		throws Exception {
		CTFObject parent = new CTFFile(new CollabNetApp(""), "");
		DocumentSoapRow data = new DocumentSoapRow();

		CTFDocument result = new CTFDocument(parent, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDescription());
		assertEquals("/sf/go/null", result.getURL());
		assertEquals(null, result.getPath());
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		CTFDocument fixture = new CTFDocument(new CTFFile(new CollabNetApp(""), ""), new DocumentSoapRow());

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetURL_1()
		throws Exception {
		CTFDocument fixture = new CTFDocument(new CTFFile(new CollabNetApp(""), ""), new DocumentSoapRow());

		String result = fixture.getURL();

		// add additional test code here
		assertEquals("/sf/go/null", result);
	}

	/**
	 * Run the void update(CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_1()
		throws Exception {
		CTFDocument fixture = new CTFDocument(new CTFFile(new CollabNetApp(""), ""), new DocumentSoapRow());
		CTFFile file = new CTFFile(new CollabNetApp(""), "");

		fixture.update(file);

		// add additional test code here
	}

	/**
	 * Run the void update(CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_2()
		throws Exception {
		CTFDocument fixture = new CTFDocument(new CTFFile(new CollabNetApp(""), ""), new DocumentSoapRow());
		CTFFile file = new CTFFile(new CollabNetApp(""), "");

		fixture.update(file);

		// add additional test code here
	}

	/**
	 * Run the void update(CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_3()
		throws Exception {
		CTFDocument fixture = new CTFDocument(new CTFFile(new CollabNetApp(""), ""), new DocumentSoapRow());
		CTFFile file = new CTFFile(new CollabNetApp(""), "");

		fixture.update(file);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(CTFDocumentTest.class);
	}
}