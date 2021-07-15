package com.rer.test.smoke;

import com.rer.step.ArriveStep;
import com.rer.step.LoginStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    private ArriveStep arriveStep = new ArriveStep();
    private LoginStep loginStep = new LoginStep();

    @Test
    public void canLoginExistingUser(){
        arriveStep.arriveToHomePage();
        loginStep.clickToLoginButton().fillInLoginForm();
        Assert.assertTrue(loginStep.loginDone());
    }
}
