package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class PractisePage extends TestBase {

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='sex-0']")
	WebElement maleGender;

	@FindBy(xpath = "//input[@id='sex-1']")
	WebElement femaleGender;

	@FindBy(xpath = "//input[@id='exp-0']")
	WebElement yoeOne;

	@FindBy(xpath = "//input[@id='exp-1']")
	WebElement yoeTwo;

	@FindBy(xpath = "//input[@id='exp-2']")
	WebElement yoeThree;

	@FindBy(xpath = "//input[@id='exp-3']")
	WebElement yoeFour;

	@FindBy(xpath = "//input[@id='exp-4']")
	WebElement yoeFive;

	@FindBy(xpath = "//input[@id='exp-5']")
	WebElement yoeSix;

	@FindBy(xpath = "//input[@id='exp-6']")
	WebElement yoeSeven;

	@FindBy(xpath = "//input[@id='datepicker']")
	WebElement date;

	@FindBy(xpath = "//input[@id='profession-0']")
	WebElement checkBoxManualTester;

	@FindBy(xpath = "//input[@id='profession-1']")
	WebElement checkBoxAutomationTester;

	@FindBy(xpath = "//input[@id='tool-0']")
	WebElement checkBoxUFT;

	@FindBy(xpath = "//input[@id='tool-1']")
	WebElement checkBoxProtractor;

	@FindBy(xpath = "//input[@id='tool-2']")
	WebElement checkBoxSeleniumWebDriver;

	@FindBy(xpath = "//Select[@id='continents']")
	WebElement continentsDropDown;

	@FindBy(xpath = "")
	WebElement seleniumCommands;

	@FindBy(xpath = "")
	WebElement uploadImage;

	@FindBy(xpath = "//a[text()='Click here to Download File']")
	WebElement downloadLink;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement button;

	public PractisePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnButton() {
		button.click();
	}

	public void enterFirstLastName(String firstNameData, String lastNameData) {
		firstName.sendKeys(firstNameData);
		lastName.sendKeys(lastNameData);
	}

	public void selectGender(String gender) {
		if (gender.equalsIgnoreCase("Male"))
			maleGender.click();
		else
			femaleGender.click();
	}

	public void selectYOE(int years) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		switch (years) {
		case 1:
			wait.until(ExpectedConditions.elementToBeClickable(yoeOne));
			yoeOne.click();
			System.out.println("Clicked 1");
			break;
		case 2:
			wait.until(ExpectedConditions.elementToBeClickable(yoeTwo));
			yoeTwo.click();
			System.out.println("Clicked 2");
			break;
		case 3:
			wait.until(ExpectedConditions.elementToBeClickable(yoeThree));
			yoeThree.click();
			System.out.println("Clicked 3");
			break;
		case 4:
			wait.until(ExpectedConditions.elementToBeClickable(yoeFour));
			yoeFour.click();
			System.out.println("Clicked 4");
			break;
		case 5:
			wait.until(ExpectedConditions.elementToBeClickable(yoeFive));
			yoeFive.click();
			System.out.println("Clicked 5");
			break;
		case 6:
			wait.until(ExpectedConditions.elementToBeClickable(yoeSix));
			System.out.println("Clicked 6");
			yoeSix.click();
			break;
		case 7:
			wait.until(ExpectedConditions.elementToBeClickable(yoeSeven));
			yoeSeven.click();
			System.out.println("Clicked 7");
			break;
		default:
			System.out.println("Not present");
		}
	}

	public void selectProfession(String professionName) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		if (professionName.equalsIgnoreCase("Manual Tester")) {
			System.out.println("Manual tester");
			wait.until(ExpectedConditions.elementToBeClickable(checkBoxManualTester));
			checkBoxManualTester.click();

		} else if (professionName.equalsIgnoreCase("Automation Tester")) {
			System.out.println("Automation tester");
			wait.until(ExpectedConditions.elementToBeClickable(checkBoxAutomationTester));
			checkBoxAutomationTester.click();

		} else {
			System.out.println("Both");
			wait.until(ExpectedConditions.elementToBeClickable(checkBoxManualTester));
			checkBoxManualTester.click();
			checkBoxAutomationTester.click();
		}
	}

	public void clickOnDownload() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.elementToBeClickable(downloadLink));
		downloadLink.click();
		System.out.println(driver.getTitle());
	}

	public void selectContinents(String continentName) {
		Select select = new Select(continentsDropDown);
		switch (continentName) {
		case "Asia":
			select.selectByVisibleText("Asia");
			break;
		case "Europe":
			select.selectByVisibleText("Europe");
			break;
		case "Africa":
			select.selectByVisibleText("Africa");
			break;
		case "Australia":
			select.selectByVisibleText("Australia");
			break;
		case "South America":
			select.selectByVisibleText("South America");
			break;
		case "Antartica":
			select.selectByVisibleText("Antartica");
			break;
		case "North America":
			select.selectByVisibleText("North America");
			break;
		}
	}
}
