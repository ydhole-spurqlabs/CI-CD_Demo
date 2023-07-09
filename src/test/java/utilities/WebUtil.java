package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class WebUtil {
    public static WebDriver driver;

    public static WebDriver initWebDriver() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        return driver;
    }

    public static void tearDown() {
        driver.quit();
    }
}
