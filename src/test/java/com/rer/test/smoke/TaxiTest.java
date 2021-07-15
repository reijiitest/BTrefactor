package com.rer.test.smoke;

import com.rer.step.ArriveStep;
import com.rer.step.TaxiStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaxiTest extends BaseTest {

    private ArriveStep arriveStep = new ArriveStep();
    private TaxiStep taxiStep = new TaxiStep();

    @Test
    public void canCheckTaxiPrice() {
        arriveStep.arriveToHomePage();
        taxiStep.clickToTaxiButton().fillTaxiBookingForm();
        Assert.assertTrue(taxiStep.taxiPricesVisible());
    }
}