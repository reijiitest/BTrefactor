package com.rer.step;

import com.rer.page.LoginPage;
import com.rer.page.RegistrationPage;

public class RegisterStep {
    public RegisterStep clickToRegisterButton(){
        LoginPage loginPage = new LoginPage();
        loginPage.goToRegistration();
        return this;
    }

    public RegisterStep fillRegistrationFormAndSubmit(){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.fillCredentialsAndSubmit();
        return this;
    }

    public boolean registrationDone(){
        RegistrationPage registrationPage = new RegistrationPage();
        return registrationPage.checkRegTitle();
    }

}
