package com.rer.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverOrigin {

   public static WebDriver driver;


   public static WebDriver connectDriver(){
       if(driver == null){
           driver = new ChromeDriver();
       }
       return driver;
   }
}
