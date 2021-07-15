package com.rer.page;

import com.rer.util.CommonActionsPerformer;

import static com.rer.util.TestDataReader.testDataReader;

public class LoginPage extends BasePage{

    CommonActionsPerformer perform = new CommonActionsPerformer();

    private final String fieldUsername = "//input[@id='inp_username']";
    private final String fieldPassword = "//input[@id='inp_password']";
    private final String buttonSubmitLogin = "//a[@class='greenButton' and @tabindex='3']";
    private final String buttonProceedToRegistration = "//*[contains(text(),'Register »')]";

    private final String testUserName = testDataReader(1);
    private final String testPassword = testDataReader(2);

    public void fillUsername(){
        perform.fillIn(fieldUsername, testUserName);
    }

    public void fillPassword(){
        perform.fillIn(fieldPassword, testPassword);
    }

    public void submitLogin(){
        perform.clickTo(buttonSubmitLogin);
    }

    public void goToRegistration(){
        perform.clickTo(buttonProceedToRegistration);
    }

    public boolean checkIfIsLoginPage(){
        String title = driver.getCurrentUrl();
        return (title.equals(testDataReader(6)));
    }

}
