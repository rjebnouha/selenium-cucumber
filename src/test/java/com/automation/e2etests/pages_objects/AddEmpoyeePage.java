package com.automation.e2etests.pages_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.automation.e2etests.utils.BasePage;
import com.automation.e2etests.utils.Setup;

public class AddEmpoyeePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']") 
	private static WebElement btnPim;

	@FindBy(how = How.XPATH, using = "//button[@type='button']")
	private static WebElement Addemployee;

	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	private static WebElement firstName;

	@FindBy(how = How.XPATH, using = "//input[@name='middleName']")
	private static WebElement middleName;

	@FindBy(how = How.XPATH, using = "//input[@name='lastName']")
	private static WebElement lastName;

	@FindBy(how = How.XPATH, using = "//input[@class='oxd-input oxd-input--active']")
	private static WebElement id;    

	@FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private static WebElement btnsave;

	@FindBy(how = How.XPATH, using = "//h6[@class='oxd-text oxd-text--h6 --strong']")
	private static WebElement employé;

	@FindBy(xpath = "//div[contains(@class, 'oxd-toast-content')]//p[contains(text(), 'Successfully')]")
	private static WebElement notification;

	@FindBy(xpath = "//h6[contains(@class, 'employee-name')]")
	private static WebElement employeeName;

	public AddEmpoyeePage() {
		super(Setup.getDriver());

	}

	public static WebElement getPim() {

		return btnPim;
	}

	public static WebElement getAddemployee() {

		return Addemployee;
	}

	public static WebElement getfirstName() {

		return firstName;
	}

	public static WebElement getmiddleName() {

		return middleName;
	}

	public static WebElement getlastName() {

		return lastName;
	}

	public static WebElement getid() {

		return id;
	}

	public static WebElement getbtnsave() {

		return btnsave;
	}

	public static WebElement getnotification() {

		return notification;
	}

	public static WebElement getEmployeeName() {

		return employeeName;
	}

}
