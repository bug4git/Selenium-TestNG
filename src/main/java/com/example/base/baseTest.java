package com.example.framework.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public void selectRadioButton(By locator) {
        driver.findElement(locator).click();
    }

    public void selectCheckbox(By locator) {
        WebElement checkbox = driver.findElement(locator);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void selectDropdownByValue(By locator, String value) {
        new Select(driver.findElement(locator)).selectByValue(value);
    }

    public void uploadFile(By locator, String filePath) {
        driver.findElement(locator).sendKeys(filePath);
    }
}
