package com.example.framework.pages;

import com.example.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends BasePage {

    // Locators
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By emailField = By.id("userEmail");
    private By genderMaleRadio = By.xpath("//label[text()='Male']");
    private By mobileNumberField = By.id("userNumber");
    private By dateOfBirthInput = By.id("dateOfBirthInput");
    private By hobbiesSportsCheckbox = By.xpath("//label[text()='Sports']");
    private By uploadPictureInput = By.id("uploadPicture");
    private By addressField = By.id("currentAddress");
    private By stateDropdown = By.id("react-select-3-input");
    private By cityDropdown = By.id("react-select-4-input");
    private By submitButton = By.id("submit");

    // Constructor
    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public void fillFirstName(String firstName) {
        enterText(firstNameField, firstName);
    }

    public void fillLastName(String lastName) {
        enterText(lastNameField, lastName);
    }

    public void fillEmail(String email) {
        enterText(emailField, email);
    }

    public void selectGenderMale() {
        selectRadioButton(genderMaleRadio);
    }

    public void fillMobileNumber(String mobileNumber) {
        enterText(mobileNumberField, mobileNumber);
    }

    public void selectDateOfBirth(String date) {
        enterText(dateOfBirthInput, date);
    }

    public void selectHobbiesSports() {
        selectCheckbox(hobbiesSportsCheckbox);
    }

    public void uploadPicture(String filePath) {
        uploadFile(uploadPictureInput, filePath);
    }

    public void fillAddress(String address) {
        enterText(addressField, address);
    }

    public void selectState(String state) {
        enterText(stateDropdown, state);
    }

    public void selectCity(String city) {
        enterText(cityDropdown, city);
    }

    public void clickSubmit() {
        clickElement(submitButton);
    }
}
