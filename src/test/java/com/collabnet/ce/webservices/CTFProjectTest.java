package com.collabnet.ce.webservices;

import java.rmi.RemoteException;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.collabnet.ce.soap50.webservices.cemain.ProjectMemberSoapRow;
import com.collabnet.ce.soap50.webservices.cemain.ProjectSoapDO;
import com.collabnet.ce.soap50.webservices.cemain.ProjectSoapRow;

/**
 * The class <code>CTFProjectTest</code> contains tests for the class <code>{@link CTFProject}</code>.
 *
 * @generatedBy CodePro at 12/03/14 18:03
 * @author yarenty
 * @version $Revision: 1.0 $
 */
public class CTFProjectTest {
	/**
	 * Run the CTFProject(CollabNetApp,ProjectSoapDO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testCTFProject_1()
		throws Exception {
		CollabNetApp app = new CollabNetApp("");
		ProjectSoapDO data = new ProjectSoapDO();

		CTFProject result = new CTFProject(app, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CTFProject(CollabNetApp,ProjectSoapRow) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testCTFProject_2()
		throws Exception {
		CollabNetApp app = new CollabNetApp("");
		ProjectSoapRow data = new ProjectSoapRow();

		CTFProject result = new CTFProject(app, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the void addMember(CTFUser) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testAddMember_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		CTFUser u = new CTFUser(new CollabNetApp(""), new ProjectMemberSoapRow());

		fixture.addMember(u);

		// add additional test code here
	}

	/**
	 * Run the void addMember(CTFUser) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testAddMember_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		CTFUser u = new CTFUser(new CollabNetApp(""), new ProjectMemberSoapRow());

		fixture.addMember(u);

		// add additional test code here
	}

	/**
	 * Run the void addMember(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testAddMember_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String userName = "";

		fixture.addMember(userName);

		// add additional test code here
	}

	/**
	 * Run the void addMember(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testAddMember_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String userName = "";

		fixture.addMember(userName);

		// add additional test code here
	}

	/**
	 * Run the CTFPackage createPackage(String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreatePackage_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String title = "";
		String description = "";
		boolean isPublished = true;

		CTFPackage result = fixture.createPackage(title, description, isPublished);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFPackage createPackage(String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreatePackage_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String title = "";
		String description = "";
		boolean isPublished = true;

		CTFPackage result = fixture.createPackage(title, description, isPublished);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFRole createRole(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateRole_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String title = "";
		String description = "";

		CTFRole result = fixture.createRole(title, description);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFRole createRole(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateRole_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String title = "";
		String description = "";

		CTFRole result = fixture.createRole(title, description);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFTracker createTracker(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateTracker_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String name = "";
		String title = "";
		String description = "";

		CTFTracker result = fixture.createTracker(name, title, description);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFTracker createTracker(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCreateTracker_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String name = "";
		String title = "";
		String description = "";

		CTFTracker result = fixture.createTracker(name, title, description);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getAdmins() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetAdmins_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getAdmins();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getAdmins() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetAdmins_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getAdmins();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getAdmins() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetAdmins_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getAdmins();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getAdmins() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetAdmins_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getAdmins();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getMembers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetMembers_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getMembers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getMembers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetMembers_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getMembers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getMembers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetMembers_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getMembers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<CTFUser> getMembers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetMembers_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		List<CTFUser> result = fixture.getMembers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getOrCreateDocumentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetOrCreateDocumentFolder_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		CTFDocumentFolder result = fixture.getOrCreateDocumentFolder(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getOrCreateDocumentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetOrCreateDocumentFolder_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		CTFDocumentFolder result = fixture.getOrCreateDocumentFolder(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getOrCreateDocumentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetOrCreateDocumentFolder_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		CTFDocumentFolder result = fixture.getOrCreateDocumentFolder(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getOrCreateDocumentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetOrCreateDocumentFolder_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		CTFDocumentFolder result = fixture.getOrCreateDocumentFolder(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getOrCreateDocumentFolder(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetOrCreateDocumentFolder_5()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		CTFDocumentFolder result = fixture.getOrCreateDocumentFolder(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetPackages_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetPackages_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetPackages_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFPackage> getPackages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetPackages_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFPackage> result = fixture.getPackages();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRole> getRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetRoles_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFRole> result = fixture.getRoles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRole> getRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetRoles_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFRole> result = fixture.getRoles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getRootFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetRootFolder_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFDocumentFolder result = fixture.getRootFolder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getRootFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetRootFolder_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFDocumentFolder result = fixture.getRootFolder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getRootFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetRootFolder_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFDocumentFolder result = fixture.getRootFolder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getRootFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetRootFolder_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFDocumentFolder result = fixture.getRootFolder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFDocumentFolder getRootFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetRootFolder_5()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFDocumentFolder result = fixture.getRootFolder();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFScmRepository> getScmRepositories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetScmRepositories_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFScmRepository> result = fixture.getScmRepositories();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFScmRepository> getScmRepositories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetScmRepositories_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFScmRepository> result = fixture.getScmRepositories();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFScmRepository> getScmRepositories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetScmRepositories_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFScmRepository> result = fixture.getScmRepositories();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFScmRepository> getScmRepositories() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetScmRepositories_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFScmRepository> result = fixture.getScmRepositories();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test
	public void testGetTitle_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		String result = fixture.getTitle();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CTFList<CTFTracker> getTrackers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetTrackers_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFTracker> result = fixture.getTrackers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFTracker> getTrackers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetTrackers_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFTracker> result = fixture.getTrackers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFTracker> getTrackers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetTrackers_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFTracker> result = fixture.getTrackers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFTracker> getTrackers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetTrackers_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());

		CTFList<CTFTracker> result = fixture.getTrackers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRole> getUserRoles(CTFUser) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetUserRoles_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		CTFUser u = new CTFUser(new CollabNetApp(""), new ProjectMemberSoapRow());

		CTFList<CTFRole> result = fixture.getUserRoles(u);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRole> getUserRoles(CTFUser) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetUserRoles_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		CTFUser u = new CTFUser(new CollabNetApp(""), new ProjectMemberSoapRow());

		CTFList<CTFRole> result = fixture.getUserRoles(u);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRole> getUserRoles(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetUserRoles_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String username = "";

		CTFList<CTFRole> result = fixture.getUserRoles(username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CTFList<CTFRole> getUserRoles(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetUserRoles_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String username = "";

		CTFList<CTFRole> result = fixture.getUserRoles(username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasMember(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testHasMember_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String username = "";

		boolean result = fixture.hasMember(username);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasMember(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testHasMember_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String username = "";

		boolean result = fixture.hasMember(username);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasMember(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testHasMember_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String username = "";

		boolean result = fixture.hasMember(username);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasMember(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testHasMember_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String username = "";

		boolean result = fixture.hasMember(username);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasMember(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testHasMember_5()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String username = "";

		boolean result = fixture.hasMember(username);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String verifyPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testVerifyPath_1()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		String result = fixture.verifyPath(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String verifyPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testVerifyPath_2()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		String result = fixture.verifyPath(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String verifyPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testVerifyPath_3()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		String result = fixture.verifyPath(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String verifyPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testVerifyPath_4()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		String result = fixture.verifyPath(documentPath);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String verifyPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:03
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testVerifyPath_5()
		throws Exception {
		CTFProject fixture = new CTFProject(new CollabNetApp(""), new ProjectSoapDO());
		String documentPath = "/";

		String result = fixture.verifyPath(documentPath);

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
		new org.junit.runner.JUnitCore().run(CTFProjectTest.class);
	}
}