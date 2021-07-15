package com.rer.test.smoke;

import com.rer.step.ArriveStep;
import com.rer.step.LoginStep;
import com.rer.step.RegisterStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    private ArriveStep arriveStep = new ArriveStep();
    private LoginStep loginStep = new LoginStep();
    private RegisterStep registerStep = new RegisterStep();

    @Test
    public void canRegisterNewUser(){
        arriveStep.arriveToHomePage();
        loginStep.clickToLoginButton();
        registerStep.clickToRegisterButton().fillRegistrationFormAndSubmit();
        Assert.assertTrue(registerStep.registrationDone());
    }

}
