package com.collabnet.ce.webservices;

import java.rmi.RemoteException;
import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import com.collabnet.ce.soap50.types.SoapFieldValues;
import com.collabnet.ce.soap50.webservices.tracker.ArtifactSoapDO;
import com.collabnet.ce.soap50.webservices.tracker.ArtifactSoapRow;

/**
 * The class <code>CTFArtifactTest</code> contains tests for the class <code>{@link CTFArtifact}</code>.
 *
 * @generatedBy CodePro at 12/03/14 18:02
 * @author yarenty
 * @version $Revision: 1.0 $
 */
public class CTFArtifactTest {
	/**
	 * Run the CTFArtifact(CTFObject,ArtifactSoapDO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testCTFArtifact_1()
		throws Exception {
		CTFObject parent = new CTFFile(new CollabNetApp(""), "");
		ArtifactSoapDO data = new ArtifactSoapDO();

		CTFArtifact result = new CTFArtifact(parent, data);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPath());
		assertEquals(0, result.getVersion());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getCategory());
		assertEquals(null, result.getGroup());
		assertEquals("/sf/go/null", result.getURL());
		assertEquals(0, result.getPriority());
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getCreatedBy());
		assertEquals(null, result.getCreatedDate());
		assertEquals(null, result.getCloseDate());
		assertEquals(null, result.getFolderId());
		assertEquals(0, result.getActualHours());
		assertEquals(null, result.getStatusClass());
		assertEquals(0, result.getEstimatedHours());
		assertEquals(null, result.getFlexFields());
		assertEquals(null, result.getAssignedTo());
		assertEquals(null, result.getReportedReleaseId());
		assertEquals(null, result.getResolvedReleaseId());
		assertEquals(null, result.getCustomer());
		assertEquals(null, result.getLastModifiedBy());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getLastModifiedDate());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the CTFArtifact(CTFObject,ArtifactSoapRow) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testCTFArtifact_2()
		throws Exception {
		CTFObject parent = new CTFFile(new CollabNetApp(""), "");
		ArtifactSoapRow src = new ArtifactSoapRow();

		CTFArtifact result = new CTFArtifact(parent, src);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPath());
		assertEquals(0, result.getVersion());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getCategory());
		assertEquals(null, result.getGroup());
		assertEquals("/sf/go/null", result.getURL());
		assertEquals(0, result.getPriority());
		assertEquals(null, result.getTitle());
		assertEquals(null, result.getCreatedBy());
		assertEquals(null, result.getCreatedDate());
		assertEquals(null, result.getCloseDate());
		assertEquals(null, result.getFolderId());
		assertEquals(0, result.getActualHours());
		assertEquals(null, result.getStatusClass());
		assertEquals(0, result.getEstimatedHours());
		assertEquals(null, result.getFlexFields());
		assertEquals(null, result.getAssignedTo());
		assertEquals(null, result.getReportedReleaseId());
		assertEquals(null, result.getResolvedReleaseId());
		assertEquals(null, result.getCustomer());
		assertEquals(null, result.getLastModifiedBy());
		assertEquals(null, result.getStatus());
		assertEquals(null, result.getLastModifiedDate());
		assertEquals(null, result.getId());
	}

	/**
	 * Run the int getActualHours() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetActualHours_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		int result = fixture.getActualHours();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getAssignedTo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetAssignedTo_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getAssignedTo();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getCategory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetCategory_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getCategory();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getCloseDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetCloseDate_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		Date result = fixture.getCloseDate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getCreatedBy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetCreatedBy_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getCreatedBy();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getCreatedDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetCreatedDate_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		Date result = fixture.getCreatedDate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getCustomer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetCustomer_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getCustomer();

		// add additional test code here
		assertEquals(null, result);
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
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getEstimatedHours() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetEstimatedHours_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		int result = fixture.getEstimatedHours();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the SoapFieldValues getFlexFields() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetFlexFields_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		SoapFieldValues result = fixture.getFlexFields();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getFolderId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetFolderId_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getFolderId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetGroup_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getGroup();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getLastModifiedBy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetLastModifiedBy_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getLastModifiedBy();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Date getLastModifiedDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetLastModifiedDate_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		Date result = fixture.getLastModifiedDate();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetPath_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getPath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetPriority_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		int result = fixture.getPriority();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getReportedReleaseId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetReportedReleaseId_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getReportedReleaseId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getResolvedReleaseId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetResolvedReleaseId_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getResolvedReleaseId();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getStatus();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getStatusClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetStatusClass_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getStatusClass();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetTitle_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getTitle();

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
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		String result = fixture.getURL();

		// add additional test code here
		assertEquals("/sf/go/null", result);
	}

	/**
	 * Run the int getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		int result = fixture.getVersion();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void refill() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testRefill_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		fixture.refill();

		// add additional test code here
	}

	/**
	 * Run the void refill() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testRefill_2()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());

		fixture.refill();

		// add additional test code here
	}

	/**
	 * Run the void setActualHours(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetActualHours_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		int actualHours = 1;

		fixture.setActualHours(actualHours);

		// add additional test code here
	}

	/**
	 * Run the void setAssignedTo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetAssignedTo_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String assignedTo = "";

		fixture.setAssignedTo(assignedTo);

		// add additional test code here
	}

	/**
	 * Run the void setCategory(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetCategory_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String category = "";

		fixture.setCategory(category);

		// add additional test code here
	}

	/**
	 * Run the void setCloseDate(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetCloseDate_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		Date closeDate = new Date();

		fixture.setCloseDate(closeDate);

		// add additional test code here
	}

	/**
	 * Run the void setCustomer(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetCustomer_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String customer = "";

		fixture.setCustomer(customer);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setEstimatedHours(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetEstimatedHours_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		int estimatedHours = 1;

		fixture.setEstimatedHours(estimatedHours);

		// add additional test code here
	}

	/**
	 * Run the void setFlexFields(SoapFieldValues) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetFlexFields_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		SoapFieldValues flexFields = new SoapFieldValues();

		fixture.setFlexFields(flexFields);

		// add additional test code here
	}

	/**
	 * Run the void setFolderId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetFolderId_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String folderId = "";

		fixture.setFolderId(folderId);

		// add additional test code here
	}

	/**
	 * Run the void setGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetGroup_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String group = "";

		fixture.setGroup(group);

		// add additional test code here
	}

	/**
	 * Run the void setPriority(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetPriority_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		int priority = 1;

		fixture.setPriority(priority);

		// add additional test code here
	}

	/**
	 * Run the void setReportedReleaseId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetReportedReleaseId_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String reportedReleaseId = "";

		fixture.setReportedReleaseId(reportedReleaseId);

		// add additional test code here
	}

	/**
	 * Run the void setResolvedReleaseId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetResolvedReleaseId_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String resolvedReleaseId = "";

		fixture.setResolvedReleaseId(resolvedReleaseId);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String status = "";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setStatusClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetStatusClass_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String statusClass = "";

		fixture.setStatusClass(statusClass);

		// add additional test code here
	}

	/**
	 * Run the void setTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test
	public void testSetTitle_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String title = "";

		fixture.setTitle(title);

		// add additional test code here
	}

	/**
	 * Run the void update(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_1()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String comment = "";

		fixture.update(comment);

		// add additional test code here
	}

	/**
	 * Run the void update(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_2()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String comment = "";

		fixture.update(comment);

		// add additional test code here
	}

	/**
	 * Run the void update(String,String,String,CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_3()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String comment = "";
		String fileName = "";
		String fileMimeType = "";
		CTFFile file = new CTFFile(new CollabNetApp(""), "");

		fixture.update(comment, fileName, fileMimeType, file);

		// add additional test code here
	}

	/**
	 * Run the void update(String,String,String,CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_4()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String comment = "";
		String fileName = "";
		String fileMimeType = "";
		CTFFile file = new CTFFile(new CollabNetApp(""), "");

		fixture.update(comment, fileName, fileMimeType, file);

		// add additional test code here
	}

	/**
	 * Run the void update(String,String,String,CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_5()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String comment = "";
		String fileName = "";
		String fileMimeType = "";
		CTFFile file = null;

		fixture.update(comment, fileName, fileMimeType, file);

		// add additional test code here
	}

	/**
	 * Run the void update(String,String,String,CTFFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/03/14 18:02
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUpdate_6()
		throws Exception {
		CTFArtifact fixture = new CTFArtifact(new CTFFile(new CollabNetApp(""), ""), new ArtifactSoapDO());
		String comment = "";
		String fileName = "";
		String fileMimeType = "";
		CTFFile file = new CTFFile(new CollabNetApp(""), "");

		fixture.update(comment, fileName, fileMimeType, file);

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
		new org.junit.runner.JUnitCore().run(CTFArtifactTest.class);
	}
}