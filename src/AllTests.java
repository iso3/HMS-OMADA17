import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestRoom.class);
		suite.addTestSuite(TestReceptionPersonell.class);
		suite.addTestSuite(TestCustomer.class);
		//$JUnit-END$
		return suite;
	}

}
