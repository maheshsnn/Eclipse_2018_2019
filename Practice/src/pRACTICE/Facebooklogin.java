package pRACTICE;

public class Facebooklogin {

	WebDriver d;

	@BeforeClass
	public void done() {

		d = new FirefoxDriver();
		d.get("http://www.facebooklogin.com");
		d.manage().window().maximize();

		String m = d.findElement(By.xpath("")).getText();

	}

	@Test
	public void facebook() throws Exception {

		for (int i = 0; i <= 3; i++) {
			d.findElement(By.id("email")).clear();
			d.findElement(By.id("email")).sendKeys(XSLX.readcell(i, 0));
			d.findElement(By.id("pass")).clear();
			d.findElement(By.id("pass")).sendKeys(XSLX.readcell(i, 1));
			Thread.sleep(3000);
			d.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
			if (d.findElement(By.xpath("//div[@class='fsl fwb fcb']"))
					.getText() == "Incorrect email address or phone number") {
				XSLX.writetocell(i, 3, false);
			} else {
				XSLX.writetocell(i, 3, true);
			}

		}
	}

}
