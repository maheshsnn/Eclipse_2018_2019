package scripts;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Random;

import org.apache.jasper.tagplugins.jstl.core.Url;
import org.openqa.jetty.util.URI;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Selection;


public class Randommethod {
	
	
	public static void main(String[] args) throws Exception {
		Random r=new Random();
		
		/*DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("");
		cap.setPlatform(Platform.WINDOWS);
	WebDriver driver=	new RemoteWebDriver(new URL(""),cap);*/
		
				
				
		StringSelection select=new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		
		Robot rm=new Robot();
	//	rm.keyPress(keyevent);
		
		
		String mail="mahesh.bethi"+r.nextInt()+"@gmail.com";
		System.out.println(mail);
		
		
	}

}
