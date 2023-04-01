package com.qa.tests;

import com.qa.BaseTest;
import com.qa.tests.Pages.RegistrationPage;
import com.qa.tests.Pages.LandingPage;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class landingPageTest extends BaseTest {


    RegistrationPage registrationPage;
    LandingPage landingPage;

    // Before Class
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
//        closeApp();
//        launchApp();
    }

    // After Class
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    // before Method
    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("This is Before Method");
        landingPage = new LandingPage();
        System.out.println("\n" + "+++++++++++++++++ Start of Test +++++++++++++++++" + "\n" + "Test Name: " + method.getName());

    }

    // After Method
    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    // Test 1
    @Test
    public void loginTest() {
        System.out.println("Splash Screen Test");
    }

    @Test
    //This is for Validate Login with Valid UserName and Password
    public void GotoRegistrationPage() throws InterruptedException {


        Thread.sleep(8000);
        System.out.println("This is Go to Registration Page ");
        registrationPage = landingPage.pressLoginButton();
        Thread.sleep(8000);
    }


}

