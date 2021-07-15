package com.rer.page;

import com.rer.util.CommonActionsPerformer;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.rer.util.TestDataReader.testDataReader;

public class TaxiPage extends BasePage{

    CommonActionsPerformer perform = new CommonActionsPerformer();

    private final String fieldFrom = "//input[@id='from']";
    private final String fieldTo = "//input[@id='to']";
    private final String buttonCalculatePrice = "//input[@id='jetz_taxi']";
    private final String buttonCalendarOpen = "//span[@id='departure_h3']";
    private final String buttonCalendar31 = "//*[@href='#' and contains(text(),'31')]";
    private final String buttonCalendarClose = "//span[@class='close_datetime']";
    private final String buttonPassengersDropDown = "//select[@id='passenger_options']";
    private final String buttonPassengers2 = "//select[@id='passenger_options']";

    private final String destinationOfDeparture = testDataReader(11);
    private final String destinationOfArrival = testDataReader(12);

    public void fillFromField(){
        perform.fillIn(fieldFrom, destinationOfDeparture);
    }

    public void fillToField(){
        perform.fillIn(fieldTo, destinationOfArrival);
    }

    public void clickCalculatePriceButton(){
        perform.clickTo(buttonCalculatePrice);
    }

    public void selectDate(){
        perform.clickTo(buttonCalendarOpen).clickTo(buttonCalendar31).clickTo(buttonCalendarClose);
    }

    public void selectPassengersNumber(){
        perform.clickTo(buttonPassengersDropDown).clickTo(buttonPassengers2);
    }

    public boolean checkIfIsTaxiPricePage(){
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='title']")));
        String checker = String.valueOf(driver.findElement(By.xpath("//div[@class='title']")).getText());
        return (checker.contains("Search Results"));
    }

}
