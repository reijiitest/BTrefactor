package com.rer.step;

import com.rer.page.HomePage;

public class ArriveStep {

    public void arriveToHomePage(){
        HomePage homePage = new HomePage();
        homePage.goToHomePage();
    }

    public boolean arrivalDone(){
        HomePage homePage = new HomePage();
        return homePage.checkTitle();
    }

}
