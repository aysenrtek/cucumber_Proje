package Pages;

import Utilities.GWD;
import com.sun.deploy.config.WinPlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CodeElementPage extends Parent {
    public CodeElementPage() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement state;


    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement repeatedPassword;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerClick;

    @FindBy (xpath = "//div[@id='rightPanel']/h1")
    public WebElement WelcomeAssortion;

    @FindBy (name = "username")
    public WebElement username2;

    @FindBy (css = "input[name='password']")
    public WebElement password2;

    @FindBy (css = "[value='Log In']")
    public WebElement login;

   @FindBy (xpath = "//*[text()='Log Out']")
    public WebElement logoutLink;

    @FindBy (xpath = "//div[@id='rightPanel']/p")
    public WebElement loginError;

    @FindBy (xpath = "//h1[@class='title']")
    public WebElement loginSuccess;

    @FindBy (xpath = "//*[text()='Bill Pay']")
    public WebElement billpayClick;

    @FindBy (css = "[name='payee.name']")
    public WebElement payeeName;

    @FindBy (css = "[name='payee.address.street']")
    public WebElement adress2;

    @FindBy (css = "[name='payee.address.city']")
    public WebElement city2;

    @FindBy (css = "[name='payee.address.state']")
    public WebElement state2;

    @FindBy (css = "[name='payee.address.zipCode']")
    public WebElement zipcode2;

    @FindBy (css = "[name='payee.phoneNumber']")
    public WebElement phonenumber;

    @FindBy (css = "[name='payee.accountNumber']")
    public WebElement accountNumber;

    @FindBy (css = "[name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy (css = "[name='amount']")
    public WebElement amount;

    @FindBy (css = "[value='Send Payment']")
    public WebElement payment;

    @FindBy (xpath = "(//*[@class='title'])[2]")
    public WebElement verifyPayment;









}

