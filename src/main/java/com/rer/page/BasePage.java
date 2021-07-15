package com.rer.page;

import com.rer.driver.DriverOrigin;
import org.openqa.selenium.WebDriver;

import static com.rer.util.TestDataReader.testDataReader;

public abstract class BasePage {

    protected WebDriver driver;
    protected String HOMEURL = testDataReader(4);
    protected final int TIMEOUT = 5;

    public BasePage(){
        try{
            driver = DriverOrigin.connectDriver();
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("Driver issue!");
        }
    }

}
