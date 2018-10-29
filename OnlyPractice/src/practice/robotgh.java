package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class robotgh {
	
	public static void main(String[] args) throws AWTException {
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		StringSelection select=new StringSelection("");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	}

}
