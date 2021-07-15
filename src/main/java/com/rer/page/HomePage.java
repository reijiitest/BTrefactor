package com.rer.page;

import com.rer.util.CommonActionsPerformer;

import static com.rer.util.TestDataReader.testDataReader;

public class HomePage extends BasePage{

    CommonActionsPerformer perform = new CommonActionsPerformer();

    private final String buttonLoginDropDown = "//*[@class='bt_extended_menu_item show-for-large is-dropdown-submenu-parent opens-right']";
    private final String buttonLogin = "//*[@class='button-anmelden']";
    private final String buttonPrivateTravel = "//*[contains(text(),'Private travel')]";
    private final String fieldFrom = "//input[@id='from']";
    private final String fieldTo = "//input[@id='to']";
    private final String buttonCalculatePrice = "//input[@id='jetz_taxi']";
    private final String buttonCalendarOpen = "//span[@id='departure_h3']";
    private final String buttonCalendar31 = "//*[@href='#' and contains(text(),'31')]";
    private final String buttonCalendarClose = "//span[@class='close_datetime']";
    private final String buttonPassengersDropDown = "//select[@id='passenger_options']";
    private final String buttonPassengers2 = "//select[@id='passenger_options']";
    private final String buttonTaxiDropDown = "//a[contains(text(),'Taxi')]";
    private final String buttonTaxi = "//a[@href='/taxi/' and contains(text(),'All taxi cities')]";

    private final String destinationOfDeparture = testDataReader(8);
    private final String destinationOfArrival = testDataReader(9);

    public void goToHomePage(){
        driver.get(HOMEURL);
    }

    public void clickLoginButton(){
        perform.clickTo(buttonLoginDropDown).clickTo(buttonLogin);
    }

    public void clickPrivateTravelButton() {
        perform.hoverTo(buttonLoginDropDown, buttonPrivateTravel).clickTo(buttonPrivateTravel);
    }

    public HomePage clickTaxiButton() {
        perform.clickTo(buttonTaxiDropDown).clickTo(buttonTaxi);
        return this;
    }

    public boolean checkTitle(){
        String title = driver.getTitle();
        return (title.equals("Airport Transfers & Taxi Prices - Book a Cheap Taxi Online | BetterTaxi"));
    }



}
