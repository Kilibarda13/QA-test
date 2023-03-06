import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(By.id("ContentPlaceHolder1_txtUserName"));
        firstNameField.sendKeys(firstName);
    }


     public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("ContentPlaceHolder1_txtEmail"));
        emailField.sendKeys(email);
    }

    public void enterConfirmEmail(String ConfirmEmail) {
        WebElement ConfirmEmailField = driver.findElement(By.id("ContentPlaceHolder1_txtConfirmEmail"));
        ConfirmEmailField.sendKeys(ConfirmEmail);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String ConfirmPassword) {
        WebElement passwordField = driver.findElement(By.id("ContentPlaceHolder1_txtPassword2"));
        passwordField.sendKeys(ConfirmPassword);
    }

    public void submitRegistrationForm() {
        new WebDriverWait(driver, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRegister"))).click();

//        WebElement submitButton = driver.findElement(By.id("ContentPlaceHolder1_btnRegister"));
//        submitButton.click();
    }

    public void enterMyCheckBox() {
        new WebDriverWait(driver, Duration.ofSeconds(9)).until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_MyCheckBox"))).click();

//        WebElement MyCheckBoxField = driver.findElement(By.id("ContentPlaceHolder1_MyCheckBox"));
//        MyCheckBoxField.click();
    }

    public void clickRecaptcha() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.recaptcha.net')]")));
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();

//        WebElement Recaptcha = driver.findElement(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha"));
//        Recaptcha.click();
    }

    public void enterContentPlaceHolder(){
        new WebDriverWait(driver, Duration.ofSeconds(9)).until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_SubscribeNewsletter"))).click();
//        WebElement ContentPlaceHolderField = driver.findElement(By.id("ContentPlaceHolder1_SubscribeNewsletter"));
//        ContentPlaceHolderField.click();
    }
}

