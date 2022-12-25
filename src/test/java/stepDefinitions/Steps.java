package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LoginPage;
import utilities.Driver;


public class Steps {
    public WebDriver driver;
    public LoginPage loginPage;

    @Given("user launch chrome browser")
    public void user_launch_chrome_browser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage(driver);
    }

    @When("user open URL {string}")
    public void user_open_url(String string) {
        driver.get(string);
        driver.manage().window().maximize();
    }

    @When("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
        loginPage.setUserName(string);
        loginPage.setPassword(string2);
    }

    @When("click on Login")
    public void click_on_login() {
        loginPage.clickLogin();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be() {
        System.out.println(driver.getTitle());
    }


    @Then("Page Title")
    public void page_title() {
        System.out.println(driver.getTitle());
    }

    @When("user click on Log out link")
    public void user_click_on_log_out_link() {
        loginPage.clickLogout();

    }


    @Then("close browser")
    public void close_browser() {
        driver.close();
    }
}
