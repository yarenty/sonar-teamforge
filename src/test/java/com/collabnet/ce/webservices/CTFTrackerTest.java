package com.collabnet.ce.webservices;

import java.rmi.RemoteException;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.collabnet.ce.soap50.types.SoapFieldValues;
import com.collabnet.ce.soap50.webservices.cemain.ProjectSoapDO;
import com.collabnet.ce.soap50.webservices.tracker.TrackerSoapDO;
import com.collabnet.ce.soap50.webservices.tracker.TrackerSoapRow;

/**
 * The class <code>CTFTrackerTest</code> contains tests for the class <code>{@link CTFTracker}</code>.
 *
 * @generatedBy CodePro at 12/03/14 18:00
 * @author yarenty
 * @version $Revision: 1.0 $
 */
public class CTFTrackerTest {
	/**
	 * Run the CTFTracker(CTFProject,TrackerSoapDO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test
	public void testCTFTracker_1()
		throws Exception {
		CTFProject parent = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		TrackerSoapDO data = new TrackerSoapDO();

		CTFTracker result = new CTFTracker(parent, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPath());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getId());
		assertEquals(null, result.getTitle());
	}

	/**
	 * Run the CTFTracker(CTFProject,TrackerSoapRow) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test
	public void testCTFTracker_2()
		throws Exception {
		CTFProject parent = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		TrackerSoapRow data = new TrackerSoapRow();

		CTFTracker result = new CTFTracker(parent, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPath());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getId());
		assertEquals(null, result.getTitle());
	}

	/**
	 * Run the CTFArtifact createArtifact(String,String,String,String,String,String,int,int,String,String,SoapFieldValues,String,String,CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateArtifact_1()
		throws Exception {
		CTFTracker fixture = new CTFTracker(new CTFProject(new CollabNetApp(""), new ProjectSoapDO()), new TrackerSoapRow());
		String title = "";
		String description = "";
		String group = "";
		String category = "";
		String status = "";
		String customer = "";
		int priority = 1;
		int estimatedHours = 1;
		String assignTo = "";
		String releaseId = "";
		SoapFieldValues flexFields = new SoapFieldValues();
		String fileName = "";
		String fileMimeType = "";
		CTFFile file = null;

		CTFArtifact result = fixture.createArtifact(title, description, group, category, status, customer, priority, estimatedHours, assignTo, releaseId, flexFields, fileName, fileMimeType, file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFArtifact createArtifact(String,String,String,String,String,String,int,int,String,String,SoapFieldValues,String,String,CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateArtifact_2()
		throws Exception {
		CTFTracker fixture = new CTFTracker(new CTFProject(new CollabNetApp(""), new ProjectSoapDO()), new TrackerSoapRow());
		String title = "";
		String description = "";
		String group = "";
		String category = "";
		String status = "";
		String customer = "";
		int priority = 1;
		int estimatedHours = 1;
		String assignTo = "";
		String releaseId = "";
		SoapFieldValues flexFields = new SoapFieldValues();
		String fileName = "";
		String fileMimeType = "";
		CTFFile file = new CTFFile(new CollabNetApp(""), "");

		CTFArtifact result = fixture.createArtifact(title, description, group, category, status, customer, priority, estimatedHours, assignTo, releaseId, flexFields, fileName, fileMimeType, file);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFArtifact> getArtifactsByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetArtifactsByTitle_1()
		throws Exception {
		CTFTracker fixture = new CTFTracker(new CTFProject(new CollabNetApp(""), new ProjectSoapDO()), new TrackerSoapRow());
		String title = "";

		List<CTFArtifact> result = fixture.getArtifactsByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFArtifact> getArtifactsByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetArtifactsByTitle_2()
		throws Exception {
		CTFTracker fixture = new CTFTracker(new CTFProject(new CollabNetApp(""), new ProjectSoapDO()), new TrackerSoapRow());
		String title = "";

		List<CTFArtifact> result = fixture.getArtifactsByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFArtifact> getArtifactsByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetArtifactsByTitle_3()
		throws Exception {
		CTFTracker fixture = new CTFTracker(new CTFProject(new CollabNetApp(""), new ProjectSoapDO()), new TrackerSoapRow());
		String title = "";

		List<CTFArtifact> result = fixture.getArtifactsByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFArtifact> getArtifactsByTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetArtifactsByTitle_4()
		throws Exception {
		CTFTracker fixture = new CTFTracker(new CTFProject(new CollabNetApp(""), new ProjectSoapDO()), new TrackerSoapRow());
		String title = "";

		List<CTFArtifact> result = fixture.getArtifactsByTitle(title);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFProject getProject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	@Test
	public void testGetProject_1()
		throws Exception {
		CTFTracker fixture = new CTFTracker(new CTFProject(new CollabNetApp(""), new ProjectSoapDO()), new TrackerSoapRow());

		CTFProject result = fixture.getProject();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getId());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/03/14 18:00
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
	 * @generatedBy CodePro at 12/03/14 18:00
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
	 * @generatedBy CodePro at 12/03/14 18:00
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CTFTrackerTest.class);
	}
}