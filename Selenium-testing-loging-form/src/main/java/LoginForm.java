import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject {

    private final String USER_NAME = "Username";
    private final String PASSWORD = "Password";


    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement login_button;

    /*@FindBy (xpath = "//div[contains(text(),'You logged into a secure area!')]")
    private WebElement alertSuccess;*/

   /* @FindBy (xpath="//i[contains(.,'Logout')]")
    private WebElement logout_button;*/

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void enterUsername() {
        this.username.sendKeys(USER_NAME);
    }

    public void enterPassword() {
        this.password.sendKeys(PASSWORD);
    }

    public void pressLoginButton() {
        this.login_button.click();
    }

  /*  public void  verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }

    public void pressLogoutButton(){
        this.logout_button.click();
    }*/
}
