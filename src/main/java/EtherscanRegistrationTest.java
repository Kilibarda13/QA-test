
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EtherscanRegistrationTest {
    public WebDriver driver;

    @Before
    public void setup() {

        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Miroslav\\Downloads\\chromedriver_win32.zip\\");
        driver.get("https://etherscan.io/register");

    }

    @Test
    public void testRegistration() {

        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.enterFirstName("John87");
        registrationPage.enterEmail("john.doe@example.com");
        registrationPage.enterConfirmEmail("john.doe@example.com");
        registrationPage.enterPassword("testPassword");
        registrationPage.enterConfirmPassword("testPassword");
        registrationPage.enterContentPlaceHolder();
        registrationPage.enterMyCheckBox();
        registrationPage.clickRecaptcha();


        registrationPage.submitRegistrationForm();


        WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(@class, 'confirmation-message')]"));
        assertTrue(confirmationMessage.isDisplayed());
        assertEquals("You have successfully registered.", confirmationMessage.getText());
    }

//    @After
//    public void teardown() {

//        driver.quit();
    }
//}
