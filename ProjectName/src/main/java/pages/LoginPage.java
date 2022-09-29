package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

  //declaration
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName;
	
	
	//@FindBy (xpath = "//input[@id='pass']")
	//private WebElement password;
	
	//@FindBy (xpath = "//button[text()='Log In']")
	//private WebElement loginButton;
	
	//@FindBy (xpath = "//a[text()='Create New Account']")
	//private WebElement  createNewAccount;
	
	@FindBy (xpath = "//a[text()='Messenger']")
	private WebElement messengerLink;
	
	
	
	//initialization
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		}
	//use
	
	public void sendUserName() {
		userName.sendKeys("Velocity@gamail.com");
	}
	
	public void sendPassword(){
		
		password.sendKeys("12345");
	}
	
	public void clickonLoginButton() {
		loginButton.click();
	}
	
	
	public void createNewAccount() {
		createNewAccount.click();
	}
	
	
	public void openMessenger() {
		messengerLink.click();
	}
	//OR
	
	//public void loginFacebook() {
		
		//userName.sendKeys("Velocity");
		
		//password.sendKeys("12345");
		
		//loginButton.click();
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

