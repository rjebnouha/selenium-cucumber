package com.automation.e2etests.pages_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2etests.utils.BasePage;
import com.automation.e2etests.utils.Setup;

public class AddEmpoyeeAccountPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Admin']")
	private static WebElement adminMenu;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='User Management']")
	private static WebElement userManagement;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Users']")
	private static WebElement users;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
	private static WebElement add;

	@FindBy(how = How.XPATH, using = "(//div[contains(text(),'-- Select --')])[1]")
	private static WebElement userRole;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type for hints...']")
	private static WebElement employeName;

	@FindBy(how = How.XPATH, using = "(//div[contains(text(),'-- Select --')])[2]")
	private static WebElement status;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement userName;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement passWord;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement confirmpassWord;

	@FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private static WebElement btnsave;

	public AddEmpoyeeAccountPage() {
		super(Setup.getDriver());

	}

	public static WebElement getadminMenu() {

		return adminMenu;
	}

	public static WebElement getuserManagement() {

		return userManagement;
	}

	public static WebElement getusers() {

		return users;
	}

	public static WebElement getadd() {

		return add;
	}

	public static WebElement getuserRole() {

		return userRole;
	}

	public static WebElement getemployeName() {

		return employeName;
	}

	public static WebElement getstatus() {

		return status;
	}

	public static WebElement getuserName() {

		return userName;
	}

	public static WebElement getpassWord() {

		return passWord;
	}

	public static WebElement getconfirmpassWord() {

		return confirmpassWord;
	}

	public static WebElement getbtnsave() {

		return btnsave;
	}

}