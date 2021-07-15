package com.rer.test.smoke;

import com.rer.step.ArriveStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArriveTest extends BaseTest{

    private ArriveStep arriveStep = new ArriveStep();

    @Test
    public void canArrive(){
        arriveStep.arriveToHomePage();
        Assert.assertTrue(arriveStep.arrivalDone());
    }
}
