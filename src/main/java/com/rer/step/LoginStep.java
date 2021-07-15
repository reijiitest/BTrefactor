package com.rer.step;

import com.rer.page.HomePage;
import com.rer.page.LoginPage;

public class LoginStep {
    public LoginStep clickToLoginButton(){
        HomePage homePage = new HomePage();
        homePage.clickLoginButton();
        return this;
    }

    public LoginStep fillInLoginForm(){
        LoginPage loginPage = new LoginPage();
        loginPage.fillUsername();
        loginPage.fillPassword();
        loginPage.submitLogin();
        return this;
    }

    public boolean loginDone(){
        LoginPage loginPage = new LoginPage();
        return loginPage.checkIfIsLoginPage();
    }

}
