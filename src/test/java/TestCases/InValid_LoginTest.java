package TestCases;

import io.qameta.allure.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseSetUp;
import Reports.TestListener;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("InValid_LoginTest")
public class InValid_LoginTest extends BaseSetUp {

    
	//Test Data
    String Username = "hotcoolden@gmail.com";
    String Password = "afsdfdfsd";

    @Test (priority = 0, description="InValid Login Test")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Login test with valid username and Invalid password.")
    @Story("Valid username and Invalid password login test")
    public void InvalidLoginTest() throws InterruptedException {
        homePage
            .gotoApplication()
            .goToLoginPage();
        loginPage
            .login(Username, Password);

    }


}