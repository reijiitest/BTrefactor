package com.rer.step;

import com.rer.page.HomePage;
import com.rer.page.TaxiPage;

public class TaxiStep {

    public TaxiStep clickToTaxiButton() {
        HomePage homePage = new HomePage();
        homePage.clickTaxiButton();
        return this;
    }

    public TaxiStep fillTaxiBookingForm() {
        TaxiPage taxiPage = new TaxiPage();
        taxiPage.fillFromField();
        taxiPage.fillToField();
        taxiPage.selectDate();
        taxiPage.selectPassengersNumber();
        taxiPage.clickCalculatePriceButton();
        return this;
    }

    public boolean taxiPricesVisible() {
        TaxiPage taxiPage = new TaxiPage();
        return taxiPage.checkIfIsTaxiPricePage();
    }
}
