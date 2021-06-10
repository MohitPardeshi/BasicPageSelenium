package MohitPardeshi.testSeleniumBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.PractisePage;

public class TestCases extends TestBase {

	PractisePage p;

	public TestCases() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		init();
		p = new PractisePage();
	}

	@Test(enabled = true)
	public void clickOnButtonTest() {
		p.clickOnButton();
	}

	@Test(enabled = true)
	public void enterFirstLastNameTest() {
		p.enterFirstLastName("Mohit", "Pardeshi");
	}

	@DataProvider
	public String[] genderData() {
		String[] data = { "Male", "Female" };
		return data;

	}

	@Test(dataProvider = "genderData", enabled = true)
	public void selectGenderTest(String gender) {
		p.selectGender(gender);
	}

	@DataProvider
	public String[] getYOE() {
		String[] data = { "1", "2", "3", "4", "5", "6", "7", "8" };
		return data;
	}

	@Test(dataProvider = "getYOE", enabled = true)
	public void selectYOETest(String years) {
		int yearsInt = Integer.parseInt(years);
		p.selectYOE(yearsInt);
	}

	@Test(enabled = true)
	public void selectYOE() {
		driver.findElement(By.xpath("//input[@id='exp-3']")).click();
	}

	@DataProvider
	public String[] getProfession() {
		String[] data = { "Both","Automation Tester", "Automation Tester", "Manual Tester", "Both" };
		return data;
	}

	@Test(dataProvider = "getProfession", enabled = true)
	public void selectProfessionTest(String profession) {
		p.selectProfession(profession);
	}
	
	@Test(enabled =true)
	public void clickOnDownloadTest()
	{
		p.clickOnDownload();
	}
	
	@DataProvider()
	public String[] getContinents()
	{
		String[] data= {"Antartica","Asia","Europe","Africa","Australia","South America","North America"};
		return data;
	}
	
	@Test(dataProvider = "getContinents",enabled= true)
	public void selectContinent(String continentName)
	{
		p.selectContinents(continentName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
	driver.close();
	}

}
