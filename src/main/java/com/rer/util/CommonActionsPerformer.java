package com.rer.util;

import com.rer.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonActionsPerformer extends BasePage {

    public CommonActionsPerformer clickTo(String xPath){
        WebElement clicker = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath(xPath)));
        clicker.click();
        return this;
    }

    public CommonActionsPerformer clickToHidden(String xPath) {
        driver.findElement(By.id(xPath)).click();
        return this;
    }

    public CommonActionsPerformer hoverTo(String Path1, String Path2){
        Actions hover = new Actions(driver);
        hover.moveToElement(driver.findElement(By.xpath(Path1))).build().perform();
        hover.moveToElement(driver.findElement(By.xpath(Path2))).build().perform();
        hover.click();
        return this;
    }

    public CommonActionsPerformer fillIn(String fieldPath, String text){
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(fieldPath)));
        WebElement typer = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT))
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath(fieldPath)));
        clickTo(fieldPath);
        typer.sendKeys(text);
        return this;
    }

}
