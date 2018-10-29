package targetPack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Junitsuite extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(Junitsuite.class.getName());
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}

}
