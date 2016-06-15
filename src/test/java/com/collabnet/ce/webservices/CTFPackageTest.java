package com.collabnet.ce.webservices;

import java.rmi.RemoteException;
import org.junit.*;
import static org.junit.Assert.*;
import com.collabnet.ce.soap50.webservices.frs.PackageSoapDO;
import com.collabnet.ce.soap50.webservices.frs.PackageSoapRow;

/**
 * The class <code>CTFPackageTest</code> contains tests for the class <code>{@link CTFPackage}</code>.
 *
 * @generatedBy CodePro at 12/03/14 18:03
 * @author yarenty
 * @version $Revision: 1.0 $
 */
public class CTFPackageTest {
	/**
	 * Run the CTFPackage(CTFObject,PackageSoapDO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testCTFPackage_1()
		throws Exception {
		CTFObject parent = new CTFFile(new CollabNetApp(""), "");
		PackageSoapDO data = new PackageSoapDO();

		CTFPackage result = new CTFPackage(parent, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPath());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getId());
		assertEquals(null, result.getTitle());
	}

	/**
	 * Run the CTFPackage(CTFObject,PackageSoapRow) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testCTFPackage_2()
		throws Exception {
		CTFObject parent = new CTFFile(new CollabNetApp(""), "");
		PackageSoapRow data = new PackageSoapRow();

		CTFPackage result = new CTFPackage(parent, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPath());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getId());
		assertEquals(null, result.getTitle());
	}

	/**
	 * Run the CTFRelease createRelease(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateRelease_1()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());
		String title = "";
		String description = "";
		String status = "";
		String maturity = "";

		CTFRelease result = fixture.createRelease(title, description, status, maturity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFRelease createRelease(String,String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateRelease_2()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());
		String title = "";
		String description = "";
		String status = "";
		String maturity = "";

		CTFRelease result = fixture.createRelease(title, description, status, maturity);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void delete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testDelete_1()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());

		fixture.delete();

		// add additional test code here
	}

	/**
	 * Run the void delete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testDelete_2()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());

		fixture.delete();

		// add additional test code here
	}

	/**
	 * Run the CTFRelease getReleaseByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleaseByTitle_1()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());
		String title = "";

		CTFRelease result = fixture.getReleaseByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFRelease getReleaseByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleaseByTitle_2()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());
		String title = "";

		CTFRelease result = fixture.getReleaseByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFRelease getReleaseByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleaseByTitle_3()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());
		String title = "";

		CTFRelease result = fixture.getReleaseByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFRelease getReleaseByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleaseByTitle_4()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());
		String title = "";

		CTFRelease result = fixture.getReleaseByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFRelease getReleaseByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleaseByTitle_5()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());
		String title = "";

		CTFRelease result = fixture.getReleaseByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRelease> getReleases() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleases_1()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());

		CTFList<CTFRelease> result = fixture.getReleases();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRelease> getReleases() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleases_2()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());

		CTFList<CTFRelease> result = fixture.getReleases();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRelease> getReleases() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleases_3()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());

		CTFList<CTFRelease> result = fixture.getReleases();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRelease> getReleases() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetReleases_4()
		throws Exception {
		CTFPackage fixture = new CTFPackage(new CTFFile(new CollabNetApp(""), ""), new PackageSoapDO());

		CTFList<CTFRelease> result = fixture.getReleases();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(CTFPackageTest.class);
	}
}