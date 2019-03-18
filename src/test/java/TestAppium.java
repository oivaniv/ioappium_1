import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestAppium {
    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus 5");
        caps.setCapability("udid", "03787176d024355e");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0.1");
        caps.setCapability("appPackage", "com.cardo.smartset");
        caps.setCapability("appActivity", "com.cardo.smartset.ui.activities.PrivacyPolicyActivity");
        caps.setCapability("noReset", true);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void basicTest() throws InterruptedException {

        //Click on Privacy&Policy button
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.cardo.smartset:id/accepting_btn"))).click();

        //Click on Allow button on permissions page
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.packageinstaller:id/permission_allow_button"))).click();

        //Click on Allow button on permissions page
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.packageinstaller:id/permission_allow_button"))).click();

        //Click on Allow button on permissions page
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.packageinstaller:id/permission_allow_button"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.cardo.smartset:id/md_buttonDefaultNegative"))).click();

    }

    @Test
    public void positiveTest() throws InterruptedException {
        //Click on Privacy&Policy button
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.cardo.smartset:id/accepting_btn"))).click();

        //Click on Allow button on permissions page
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.packageinstaller:id/permission_allow_button"))).click();

        //Click on Allow button on permissions page
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.packageinstaller:id/permission_allow_button"))).click();

        //Click on Allow button on permissions page
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.id("com.android.packageinstaller:id/permission_allow_button"))).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
