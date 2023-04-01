package com.qa.tests;

import com.qa.BaseTest;
import com.qa.tests.Pages.HomePage;
import com.qa.tests.Pages.LoginPage;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.InputStream;
import java.lang.reflect.Method;

public class LoginTests extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    JSONObject loginUsers;
    JSONObject expectedText;
    InputStream ExpectedDatais;
    InputStream datais;


    @BeforeClass
    public void beforeClass() throws Exception {

        try {
            System.out.println("Before Class");
            String dataFile = "data/loginUsers.json";
            datais = getClass().getClassLoader().getResourceAsStream(dataFile);
            JSONTokener tokener = new JSONTokener(datais);
            loginUsers = new JSONObject(tokener);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (datais != null) {
                datais.close();
            }
        }

        //closeApp();
        //launchApp();

    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }


    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("This is Before Method");
        loginPage = new LoginPage();
        System.out.println("\n" + "+++++++++++++++++ Start of Test +++++++++++++++++" + "\n" + "Test Name: " + method.getName());
        System.out.println(loginUsers.getJSONObject("invalidUser").getString("username"));

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void loginTest() throws Exception {
        System.out.println("Login Test");
    }

    // xpath = //android.view.View[@content-desc="Get Started"]
    // Accessibility Id = Get Started


//    @Test
//    public void invalidUsername() {
//        System.out.println("This is Invalid UserName Block");
//        loginPage.enterUserName(loginUsers.getJSONObject("invalidUser").getString("username"));
//        loginPage.enterPassWord(loginUsers.getJSONObject("invalidUser").getString("password"));
//
//
//        String actualErrorMessage = loginPage.getErrorText();
//        String expectedErrorMessage = expectedText.getJSONObject("LoginPageExpectedData").getString("LoginErrorWarningText");
//        System.out.println("Actual Error Message: " + actualErrorMessage + "\n" + "Expected Error Message: " + expectedErrorMessage);
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
//
//    }
//
//
//    @Test
//    public void invalidPassword() {
//        System.out.println("This is Invalid Password Block");
//        loginPage.enterUserName(loginUsers.getJSONObject("invalidPassword").getString("username"));
//        loginPage.enterPassWord(loginUsers.getJSONObject("invalidPassword").getString("password"));
//        loginPage.pressLoginButton();
//
//        String actualErrorMessage = loginPage.getErrorText();
//        String expectedErrorMessage = expectedText.getJSONObject("LoginPageExpectedData").getString("LoginErrorWarningText");
//        System.out.println("Actual Error Message: " + actualErrorMessage + "\n" + "Expected Error Message: " + expectedErrorMessage);
//        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
//    }




}




