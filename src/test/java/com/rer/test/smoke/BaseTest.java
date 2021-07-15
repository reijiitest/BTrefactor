package com.rer.test.smoke;

import com.rer.driver.DriverOrigin;
import org.testng.annotations.AfterMethod;

public class BaseTest extends DriverOrigin {

    @AfterMethod(alwaysRun = true)
    protected void outDriver() {
        driver.quit();
        driver = null;
    }

}
