package TestCases;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseSetUp;
import Reports.TestListener;

@Listeners({ TestListener.class })
@Epic("Regression Tests")
@Feature("Valid_LoginTest")
public class Valid_LoginTest extends BaseSetUp {

    //Test Data
    String Username = "hotcoolden@gmail.com";
    String Password = "tanuja";

    @Test (priority = 0, description="Valid Login Test")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Login test with valid username and valid password.")
    @Story("Valid username and password login test")
    public void validLoginTest() throws InterruptedException {
        homePage
            .gotoApplication()
            .goToLoginPage();
        loginPage    
            .login(Username, Password);
        myaccountpage
        	.verifyMyAccountpageTitle("My account - My Store");
        
        loginPage
        	.logout();
    }


}