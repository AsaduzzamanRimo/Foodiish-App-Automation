package com.qa.tests.Pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Get Started\"]")
    public MobileElement getStartedButton;


//    public LoginPage enterUserName(String userName) {
//        System.out.println("Login With" + userName);
//        sendKeys(UserNameTextField, userName);
//        return this;
//    }
//
//    public LoginPage enterPassWord(String password) {
//        System.out.println("Password is " + password);
//        sendKeys(PasswordTextField, password);
//        return this;
//    }
//
//
//    public String getErrorText() {
//        String ErrorTxt = ErrorText.getText();
//        System.out.println("Error Text is " + ErrorTxt);
//        return getAttribute(ErrorText, "text");
//    }

    public HomePage pressGetStartedButton() {
        click(getStartedButton);
        return new HomePage();
    }
}

