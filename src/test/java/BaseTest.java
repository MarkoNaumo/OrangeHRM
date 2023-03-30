import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    public ChromeDriver openBrowser()
    {
        ChromeOptions options =new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//ucitavanje selecora do 10 sec
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));//ucitavanje strane do 10 sec
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        return driver;
    }
}
