package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="Email")
    @CacheLookup
    WebElement textEmail;

    @FindBy(id="Password")
    @CacheLookup
    WebElement textPassword;

    @FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
    @CacheLookup
    WebElement btnLogin;


    @FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/a")
    @CacheLookup
    WebElement linkLogout;

    public void setUserName(String userName){
        textEmail.clear();
        textEmail.sendKeys(userName);
    }

    public void setPassword(String userPassword){
        textPassword.clear();
        textPassword.sendKeys(userPassword);
    }

    public void clickLogin(){
        btnLogin.click();

    }

    public void clickLogout(){
        linkLogout.click();
    }


}
