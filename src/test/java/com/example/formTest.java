package com.example.tests;

import com.example.framework.pages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeFormTest {
    private WebDriver driver;
    private PracticeFormPage practiceFormPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        practiceFormPage = new PracticeFormPage(driver);
    }

    @Test
    public void testFillForm() {
        practiceFormPage.fillFirstName("John");
        practiceFormPage.fillLastName("Doe");
        practiceFormPage.fillEmail("john.doe@example.com");
        practiceFormPage.selectGenderMale();
        practiceFormPage.fillMobileNumber("1234567890");
        practiceFormPage.selectDateOfBirth("10 Mar 1990");
        practiceFormPage.selectHobbiesSports();
        practiceFormPage.uploadPicture("/path/to/picture.jpg");
        practiceFormPage.fillAddress("1234 Elm Street");
        practiceFormPage.selectState("NCR");
        practiceFormPage.selectCity("Delhi");
        practiceFormPage.clickSubmit();
        // Add assertions to verify success.
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
