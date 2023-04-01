package com.qa.tests.Pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LandingPage extends BaseTest {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Get Started\"]")
    public MobileElement getStartedButton;

//    @AndroidFindBy(accessibility = "Get Started")
//    public MobileElement getStartedButton2;

        public RegistrationPage pressLoginButton() {
        System.out.println("Press Login Button");
        click(getStartedButton);
        return  new RegistrationPage();
    }
}
